%%
%class LexZTilde
%standalone
%line
%column

LoopBegin = loop
LoopEnd = pool
Digit = [0-9]
Letter = [a-zA-Z]
OpenBrace = \{
CloseBrace = \}
Assignment = :=
TypeSpec = :
LParen = \(
RParen = \)


LineTerminator = \r|\n|\r\n
Whitespace = {LineTerminator} | [ \t\f]
Underscore = _

%%

{Whitespace}    {/* Do nothing! */}
{LoopBegin}     {System.out.printf("LoopBegin [%s]\n", yytext());}
{LoopEnd}     {System.out.printf("LoopEnd [%s]\n", yytext());}
{Digit}+        {System.out.printf("number [%s]\n", yytext());}
{Letter}({Letter}|{Digit}|{Underscore})*   {System.out.printf("identifier [%s]\n",yytext());}
{LoopBegin}                                {System.out.printf("LoopBegin [%s]\n", yytext());}
{LoopEnd}                                  {System.out.printf("LoopEnd [%s]\n", yytext());}
{OpenBrace}                                {System.out.printf("OpenBrace [%s]\n", yytext());}
{CloseBrace}                               {System.out.printf("CloseBrace [%s]\n", yytext());}
{Assignment}                               {System.out.printf("Assignment [%s]\n", yytext());}
{TypeSpec}                                 {System.out.printf("TypeSpec [%s]\n", yytext());}
{LParen}                                   {System.out.printf("LParen [%s]\n", yytext());}
{RParen}                                   {System.out.printf("RParen [%s]\n", yytext());}
.                                          {System.out.printf("Unidentified [%s]\n", yytext());}