%%
%class Lexer
%standalone
%line
%column

Digit = [0-9]
Letter = [a-zA-Z]
TypeSpec = :
SLComment = #({NotLineTerminator})*{LineTerminator}
LineTerminator = \r|\n|\r\n|\n\r
NotLineTerminator = [^\r\n\r\n]
MLComment = \/#(.|{LineTerminator})*#\/
Whitespace = {LineTerminator} | [ \t\f]
Underscore = _
Punctuation = [ !#\"\$%&(\\')\(\)\*\+,-\.\/:;<=>\?@\\\[\]\^_`\{\}\|~]
Char = \'({Letter}|{Punctuation}|{Digit})\'
Identifier = {Letter}({Letter}|{Digit}|{Underscore})*
PInteger = (0|([1-9]({Digit})*))
NInteger = -{PInteger}
PFloat = {PInteger}\.({Digit}({Digit})*)
NFloat = -{PFloat}
PRational = ({PInteger}\/([1-9]([0-9])*))|({PInteger}_(([1-9]([0-9])*)\/([1-9]([0-9])*)))
NRational = -{PRational}

%%
{SLComment} 	  {/* Do nothing! */}
{MLComment}       {/* Do nothing! */}
"."				  { System.out.printf("DOT [%s]\n", yytext()); }
";"               { System.out.printf("SEMICOLON [%s]\n", yytext()); }
","               { System.out.printf("COMMA [%s]\n", yytext()); }
"("               { System.out.printf("LPAR [%s]\n", yytext()); }
")"               { System.out.printf("RPAR [%s]\n", yytext()); }
"["               { System.out.printf("LSQBRA [%s]\n", yytext()); }
"]"               { System.out.printf("RSQBRA [%s]\n", yytext()); }
"{"               { System.out.printf("LCRBRA [%s]\n", yytext()); }
"}"               { System.out.printf("RCRBRA [%s]\n", yytext()); }
":="              { System.out.printf("ASSIGN [%s]\n", yytext()); }
"+"               { System.out.printf("PLUS [%s]\n", yytext()); }
"-"               { System.out.printf("MINUS[%s]\n", yytext()); }
"*"               { System.out.printf("MULT [%s]\n", yytext()); }
"/"               { System.out.printf("DIV [%s]\n", yytext()); }
"%"               { System.out.printf("MOD [%s]\n", yytext()); }
"<="              { System.out.printf("LEQ [%s]\n", yytext()); }
">="			  { System.out.printf("GEQ [%s]\n", yytext()); }
"=>"              { System.out.printf("IMPLICATION [%s]\n", yytext()); }
"=="              { System.out.printf("EQ  [%s]\n", yytext()); }
"!="              { System.out.printf("NEQ [%s]\n", yytext()); }
"<"               { System.out.printf("LT [%s]\n", yytext()); }
">"				  { System.out.printf("GT [%s]\n", yytext()); }
"&&"              { System.out.printf("AND [%s]\n", yytext()); }
"||"              { System.out.printf("OR  [%s]\n", yytext()); }
"!"               { System.out.printf("NOT [%s]\n", yytext()); }
"::"			  { System.out.printf("DOUBLECOLON [%s]\n", yytext()); }
"?"				  { System.out.printf("QM [%s]\n", yytext()); }

"fdef"            { System.out.printf("FDEF [%s]\n", yytext()); }
"main"            { System.out.printf("MAIN [%s]\n", yytext()); }
"tdef"            { System.out.printf("TDEF [%s]\n", yytext()); }
"alias"           { System.out.printf("ALIAS [%s]\n", yytext()); }
                  
"read"            { System.out.printf("READ [%s]\n", yytext()); }
"print"           { System.out.printf("PRINT [%s]\n", yytext()); }
                  
"bool"            { System.out.printf("BOOL [%S]\n", yytext()); }
"int"             { System.out.printf("INT [%s]\n", yytext()); } 
"rat"             { System.out.printf("RAT [%s]\n", yytext()); }
"float"           { System.out.printf("FLOAT [%s]\n", yytext()); }
"char"            { System.out.printf("CHAR [%s]\n", yytext()); }
"seq"             { System.out.printf("SEQ [%s]\n", yytext()); }
"dict"            { System.out.printf("DICT [%s]\n", yytext()); }
                 
"loop"            { System.out.printf("LOOP_START [%s]\n", yytext()); }
"pool"            { System.out.printf("LOOP_END [%s]\n", yytext()); }
"if"              { System.out.printf("START_IF [%s]\n", yytext()); }
"then"            { System.out.printf("THEN [%s]\n", yytext()); }
"else"            { System.out.printf("ELSE [%s]\n", yytext()); }
"fi"              { System.out.printf("END_IF [%s]\n", yytext()); }
"break"           { System.out.printf("BREAK [%s]\n", yytext()); }
"return"          { System.out.printf("RETURN [%s]\n", yytext()); }
                 

"null"            { System.out.printf("NULL [%s]\n", yytext()); }
T                 { System.out.printf("TRUE [%s]\n", yytext()); }
F 				  { System.out.printf("FALSE [%s]\n", yytext()); }
{Char} 	 		  { System.out.printf("CHAR_LIT [%s]\n", yytext()); }
{PInteger}		  { System.out.printf("PINT_LIT [%s]\n", yytext()); }
{PFloat}		  { System.out.printf("PFLOAT_LIT [%s]\n", yytext()); }
{PRational} 	  { System.out.printf("PRAT_LIT [%s]\n", yytext()); }
{NInteger}		  { System.out.printf("NINT_LIT [%s]\n", yytext()); }
{NFloat}		  { System.out.printf("NFLOAT_LIT [%s]\n", yytext()); }
{NRational} 	  { System.out.printf("NRAT_LIT [%s]\n", yytext()); }

{Whitespace}      {/* Do nothing! */}
{Identifier}      { System.out.printf("IDENT [%s]\n", yytext()); }
{TypeSpec}        { System.out.printf("TYPESPEC [%s]\n", yytext()); }
.                 { System.out.printf("Unidentified [%s]\n", yytext()); }