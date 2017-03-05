import java_cup.runtime.*;

%%
%class Lexer
%unicode
%cup
%line
%column

%{

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}

Digit = [0-9]
Letter = [a-zA-Z]
SLComment = #({NotLineTerminator})*{LineTerminator}
LineTerminator = \r|\n|\r\n|\n\r
NotLineTerminator = [^\r\n\r\n]
MLComment = \/#(.|{LineTerminator})*#\/
Whitespace = {LineTerminator} | [ \t\f]
Underscore = _
Punctuation = [ !#\"\$%&(\\')\(\)\*\+,-\.\/:;<=>\?@\\\[\]\^_`\{\}\|~]
Punctuation_Str = [ !#\$%&(\\')\(\)\*\+,-\.\/:;<=>\?@\\\[\]\^_`\{\}\|~]
Char = \'({Letter}|{Punctuation}|{Digit})?\'
String = \"({Letter}|{Punctuation_Str}|{Digit}|\\\")*\"
Identifier = {Letter}({Letter}|{Digit}|{Underscore})*
PInteger = {Digit}+
PFloat = {PInteger}\.({Digit}({Digit})*)
Fractional = {PInteger}({Whitespace})*\/({Whitespace})*([1-9]([0-9])*)
PRational = ({Fractional})|{PInteger}({Whitespace})*({Underscore})({Whitespace})*({Fractional})
Comment = {SLComment}|{MLComment}

%%
<YYINITIAL> {
	{Whitespace}      {/* Do nothing! */}
	{Comment} 	  	  {/* Do nothing! */}
	"."				  { return symbol(sym.DOT); }
	";"               { return symbol(sym.SEMICOLON); }
	","               { return symbol(sym.COMMA); }
	"("               { return symbol(sym.LPAR); }
	")"               { return symbol(sym.RPAR); }
	"["               { return symbol(sym.LSQBRA); }
	"]"               { return symbol(sym.RSQBRA); }
	"{"               { return symbol(sym.LCRBRA); }
	"}"               { return symbol(sym.RCRBRA); }
	":="              { return symbol(sym.ASSIGN); }
	"+"               { return symbol(sym.PLUS); }
	"-"               { return symbol(sym.MINUS); }
	"*"               { return symbol(sym.MULT); }
	"/"               { return symbol(sym.DIV); }
	"%"               { return symbol(sym.MOD); }
	"^"		  { return symbol(sym.POWER); }
	"<="              { return symbol(sym.LEQ); }
	">="			  { return symbol(sym.GEQ); }
	"=>"              { return symbol(sym.IMPLICATION); }
	"="               { return symbol(sym.EQ); }
	"!="              { return symbol(sym.NEQ); }
	"<"               { return symbol(sym.LT); }
	">"				  { return symbol(sym.GT); }
	"&&"              { return symbol(sym.AND); }
	"||"              { return symbol(sym.OR); }
	"!"               { return symbol(sym.NOT); }
	"::"			  { return symbol(sym.DOUBLECOLON); }
	"?"				  { return symbol(sym.QM); }
	":"               { return symbol(sym.TYPESPEC); }

	"fdef"            { return symbol(sym.FDEF); }
	"main"            { return symbol(sym.MAIN); }
	"tdef"            { return symbol(sym.TDEF); }
	"alias"           { return symbol(sym.ALIAS); }
	"len"			  { return symbol(sym.LEN); }

	"read"            { return symbol(sym.READ); }
	"print"           { return symbol(sym.PRINT); }
        "in"              { return symbol(sym.IN); }

	"bool"            { return symbol(sym.BOOL); }
	"int"             { return symbol(sym.INT); }
	"rat"             { return symbol(sym.RAT); }
	"float"           { return symbol(sym.FLOAT); }
	"char"            { return symbol(sym.CHAR); }
	"seq"             { return symbol(sym.SEQ); }
	"dict"            { return symbol(sym.DICT); }

	"loop"            { return symbol(sym.LOOP_START); }
	"pool"            { return symbol(sym.LOOP_END); }
	"if"              { return symbol(sym.START_IF); }
	"then"            { return symbol(sym.THEN); }
	"else"            { return symbol(sym.ELSE); }
	"fi"              { return symbol(sym.END_IF); }
	"break"           { return symbol(sym.BREAK); }
	"return"          { return symbol(sym.RETURN); }


	"null"            { return symbol(sym.NULL); }
	T|F               { return symbol(sym.BOOL_LIT, yytext()); }
	{Char} 	 	  { return symbol(sym.CHAR_LIT, yytext()); }
        {String}          { return symbol(sym.STRING_LIT, yytext()); }
	{PInteger}	  { return symbol(sym.PINT_LIT, yytext()); }
	{PFloat}	  { return symbol(sym.PFLOAT_LIT, yytext()); }
	{PRational} 	  { return symbol(sym.PRAT_LIT, yytext()); }
	
	{Identifier}      { return symbol(sym.IDENT); }
}

[^]  {
  System.out.println("file:" + (yyline+1) +
    ":0: Error: Invalid input '" + yytext()+"'");
  return symbol(sym.BADCHAR);
}
