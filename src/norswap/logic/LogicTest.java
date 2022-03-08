package norswap.logic;

import norswap.autumn.Autumn;
import norswap.autumn.ParseOptions;
import norswap.autumn.ParseResult;
import norswap.autumn.positions.LineMap;
import norswap.autumn.positions.LineMapString;
import norswap.logic.ast.LogicNode;
import norswap.logic.interpreter.Interpreter;
import norswap.uranium.Reactor;
import norswap.utils.IO;
import norswap.utils.visitors.Walker;
import java.nio.file.Paths;

import static norswap.utils.Util.cast;

public final class LogicTest
{
    public static void main (String[] args) {
//         String file = "fizzbuzz.si";
        String file = "kitchensink.si";
        String path = Paths.get("examples/", file).toAbsolutePath().toString();
        String src = IO.slurp(path);
        LogicGrammar grammar = new LogicGrammar();
        ParseOptions options = ParseOptions.builder().recordCallStack(true).get();
        ParseResult result = Autumn.parse(grammar.root, src, options);
        LineMap lineMap = new LineMapString(path, src);
        System.out.println(result.toString(lineMap, false));

        if (!result.fullMatch)
            return;

        LogicNode tree = cast(result.topValue());
        Reactor reactor = new Reactor();
        Walker<LogicNode> walker = SemanticAnalysis.createWalker(reactor);
        walker.walk(tree);
        reactor.run();


        if (!reactor.errors().isEmpty()) {
            System.out.println(reactor.reportErrors(it ->
                it.toString() + " (" + ((LogicNode) it).span.startString(lineMap) + ")"));

            // Alternatively, print the whole tree:
            // System.out.println(
            //     AttributeTreeFormatter.formatWalkFields(tree, reactor, SighNode.class));
            return;
        }

        Interpreter interpreter = new Interpreter(reactor);
        interpreter.interpret(tree);
        System.out.println("success");
    }
}
