# Logic Programming
## My own language implementation


> A tear is an intellectual thing, and a sigh is the Sword of an Angel King.

A language implementation demo, demonstrating the use of my parsing library [Autumn], my semantic
analysis library [Uranium], as well as [ASM] for bytecode generation.

[Autumn]: https://github.com/norswap/autumn
[Uranium]: https://github.com/norswap/uranium
[ASM]: https://asm.ow2.io/

Key files:
- [`SighGrammar`](/src/norswap/logic/SighGrammar.java)
- [`SemanticAnalysis`](/src/norswap/logic/SemanticAnalysis.java) (1)
- [`Interpreter`](/src/norswap/logic/interpreter/Interpreter.java)
- [`BytecodeCompiler`](/src/norswap/logic/bytecode/BytecodeCompiler.java)

(1) [Here is a code review][review] of that code.

[review]: https://www.youtube.com/watch?v=AgnVQWw-4gk&list=PLOech0kWpH8-njQpmSNGSiQBPUvl8v3IM

Tests:
- [`GrammarTests`](/test/GrammarTests.java)
- [`SemanticAnalysisTests`](/test/SemanticAnalysisTests.java)
- [`InterpreterTests`](/test/InterpreterTests.java)
- [`InterpreterTests`](/test/InterpreterTests.java)
- [`BytecodeTests`](/test/BytecodeTests.java)

- TODO :
- Variable 
A fact is a predicate expression that makes a declarative statement about the problem domain. Whenever a variable occurs in a Prolog expression, it is assumed to be universally quantified. Note that all Prolog sentences must end with a period.
    likes(john, susie).                   /* John likes Susie */
    likes(X, susie).                      /* Everyone likes Susie *

-A rule is a predicate expression that uses logical implication (:-) to describe a relationship among facts. Thus a Prolog rule takes the form
    left_hand_side :- right_hand_side .
   rule nom_rule(X,Y)
- 