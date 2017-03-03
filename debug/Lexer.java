/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lexems.lex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\11\1\5\1\7\1\10\1\4\22\0\1\14\1\42\1\13"+
    "\1\3\1\15\1\37\1\43\1\16\1\25\1\26\1\36\1\35\1\24"+
    "\1\21\1\22\1\6\1\20\11\1\1\33\1\23\1\40\1\34\1\41"+
    "\1\45\1\15\5\2\1\71\15\2\1\71\6\2\1\27\1\17\1\30"+
    "\1\15\1\12\1\15\1\52\1\62\1\64\1\47\1\50\1\46\1\2"+
    "\1\65\1\53\1\2\1\67\1\56\1\51\1\54\1\63\1\61\1\66"+
    "\1\60\1\57\1\55\1\70\5\2\1\31\1\44\1\32\1\15\6\0"+
    "\1\7\u1fa2\0\1\7\1\7\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\2\4\1\5\1\6"+
    "\1\4\2\1\1\2\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\2\1\1\31\16\3"+
    "\1\32\6\0\1\33\2\0\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\3\1\44\5\3\1\45"+
    "\16\3\1\46\1\0\1\47\1\0\1\33\1\50\6\3"+
    "\1\51\3\3\1\52\1\3\1\53\2\3\1\54\5\3"+
    "\1\4\1\55\1\3\1\56\1\57\1\60\1\3\1\61"+
    "\1\62\1\63\1\64\1\65\2\3\1\66\1\3\1\67"+
    "\1\70\1\71\1\72\1\3\1\73\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\72\0\72\0\u01d0\0\u020a\0\u0244\0\72\0\72\0\72"+
    "\0\72\0\72\0\72\0\72\0\72\0\72\0\72\0\u027e"+
    "\0\u02b8\0\72\0\72\0\72\0\u02f2\0\u032c\0\u0366\0\u03a0"+
    "\0\u03da\0\72\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692\0\u06cc\0\u0706"+
    "\0\256\0\u0740\0\u077a\0\u07b4\0\350\0\u07ee\0\u01d0\0\72"+
    "\0\u0828\0\u0862\0\72\0\72\0\72\0\72\0\72\0\72"+
    "\0\72\0\72\0\u089c\0\256\0\u08d6\0\u0910\0\u094a\0\u0984"+
    "\0\u09be\0\256\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a"+
    "\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea"+
    "\0\u0d24\0\u0d5e\0\u07b4\0\u0d98\0\u01d0\0\72\0\u0dd2\0\u0e0c"+
    "\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\256\0\u0f2e\0\u0f68\0\u0fa2"+
    "\0\256\0\u0fdc\0\256\0\u1016\0\u1050\0\256\0\u108a\0\u10c4"+
    "\0\u10fe\0\u1138\0\u1172\0\u07ee\0\256\0\u11ac\0\256\0\256"+
    "\0\256\0\u11e6\0\256\0\256\0\256\0\256\0\256\0\u1220"+
    "\0\u125a\0\256\0\u1294\0\256\0\256\0\256\0\256\0\u12ce"+
    "\0\256\0\256\0\256";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\2\12\1\2\1\13\1\12\1\2\1\14\1\2\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\4\1\60\4\4\1\61\73\0\1\3"+
    "\4\0\1\62\3\0\1\63\5\0\1\3\1\0\1\64"+
    "\50\0\2\4\7\0\1\4\5\0\1\4\25\0\24\4"+
    "\4\65\1\6\1\7\64\65\5\0\1\12\70\0\1\12"+
    "\70\0\1\66\67\0\3\67\2\0\1\67\3\0\1\67"+
    "\1\70\3\67\1\71\52\67\1\0\3\72\2\0\1\72"+
    "\3\0\60\72\6\0\1\62\3\0\1\63\7\0\1\64"+
    "\102\0\1\73\1\74\76\0\1\75\64\0\1\76\71\0"+
    "\1\77\71\0\1\100\100\0\1\101\72\0\1\102\26\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\1\4\1\103"+
    "\3\4\1\104\2\4\1\105\13\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\5\4\1\106\16\4\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\10\4\1\107"+
    "\13\4\1\0\2\4\7\0\1\4\5\0\1\4\25\0"+
    "\4\4\1\110\17\4\1\0\2\4\7\0\1\4\5\0"+
    "\1\4\25\0\10\4\1\111\13\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\1\112\5\4\1\113\15\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\22\4"+
    "\1\114\1\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\1\4\1\115\15\4\1\116\4\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\2\4\1\117\12\4"+
    "\1\120\6\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\2\4\1\121\21\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\2\4\1\122\1\4\1\123\17\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\12\4"+
    "\1\124\2\4\1\125\6\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\12\4\1\126\2\4\1\127\6\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\17\4"+
    "\1\130\4\4\1\0\1\131\71\0\1\132\71\0\1\133"+
    "\16\0\1\133\51\0\3\66\1\134\3\66\2\0\61\66"+
    "\1\0\3\67\2\0\1\67\3\0\1\67\1\135\3\67"+
    "\1\71\52\67\16\0\1\136\54\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\2\4\1\137\21\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\15\4\1\140\6\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\16\4"+
    "\1\141\5\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\11\4\1\142\12\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\5\4\1\143\16\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\5\4\1\144\16\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\7\4"+
    "\1\145\14\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\10\4\1\146\13\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\2\4\1\147\21\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\2\4\1\150\21\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\6\4"+
    "\1\151\15\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\15\4\1\152\6\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\20\4\1\153\3\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\4\4\1\154\2\4"+
    "\1\155\14\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\7\4\1\156\14\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\5\4\1\157\16\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\15\4\1\160\6\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\2\4"+
    "\1\161\21\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\15\4\1\162\6\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\4\4\1\163\17\4\1\0\1\131"+
    "\16\0\1\131\52\0\1\132\4\0\1\62\11\0\1\132"+
    "\51\0\3\66\1\134\2\66\1\164\2\0\61\66\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\1\165\23\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\4\4"+
    "\1\166\17\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\7\4\1\167\14\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\2\4\1\170\21\4\1\0\2\4"+
    "\7\0\1\4\5\0\1\4\25\0\6\4\1\171\15\4"+
    "\1\0\2\4\7\0\1\4\5\0\1\4\25\0\4\4"+
    "\1\172\17\4\1\0\2\4\7\0\1\4\5\0\1\4"+
    "\25\0\10\4\1\173\13\4\1\0\2\4\7\0\1\4"+
    "\5\0\1\4\25\0\1\174\23\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\6\4\1\175\15\4\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\13\4\1\176"+
    "\10\4\1\0\2\4\7\0\1\4\5\0\1\4\25\0"+
    "\1\4\1\177\22\4\1\0\2\4\7\0\1\4\5\0"+
    "\1\4\25\0\22\4\1\200\1\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\6\4\1\201\15\4\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\10\4\1\202"+
    "\13\4\1\0\2\4\7\0\1\4\5\0\1\4\25\0"+
    "\4\4\1\203\17\4\1\0\2\4\7\0\1\4\5\0"+
    "\1\4\25\0\10\4\1\204\13\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\12\4\1\205\11\4\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\7\4\1\206"+
    "\14\4\1\0\2\4\7\0\1\4\5\0\1\4\25\0"+
    "\11\4\1\207\12\4\1\0\2\4\7\0\1\4\5\0"+
    "\1\4\25\0\12\4\1\210\11\4\1\0\2\4\7\0"+
    "\1\4\5\0\1\4\25\0\7\4\1\211\14\4\1\0"+
    "\2\4\7\0\1\4\5\0\1\4\25\0\21\4\1\212"+
    "\2\4\1\0\2\4\7\0\1\4\5\0\1\4\25\0"+
    "\6\4\1\213\15\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4872];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\2\11\3\1\12\11\2\1\3\11"+
    "\5\1\1\11\17\1\6\0\1\11\2\0\10\11\27\1"+
    "\1\0\1\1\1\0\1\1\1\11\55\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[139];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 182) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.printf("UNIDENTIFIED [%s]\n", yytext());
            }
          case 62: break;
          case 2: 
            { System.out.printf("PINT_LIT [%s]\n", yytext());
            }
          case 63: break;
          case 3: 
            { System.out.printf("IDENT [%s]\n", yytext());
            }
          case 64: break;
          case 4: 
            { /* Do nothing! */
            }
          case 65: break;
          case 5: 
            { System.out.printf("DIV [%s]\n", yytext());
            }
          case 66: break;
          case 6: 
            { System.out.print(yytext());
            }
          case 67: break;
          case 7: 
            { System.out.printf("MINUS [%s]\n", yytext());
            }
          case 68: break;
          case 8: 
            { System.out.printf("DOT [%s]\n", yytext());
            }
          case 69: break;
          case 9: 
            { System.out.printf("SEMICOLON [%s]\n", yytext());
            }
          case 70: break;
          case 10: 
            { System.out.printf("COMMA [%s]\n", yytext());
            }
          case 71: break;
          case 11: 
            { System.out.printf("LPAR [%s]\n", yytext());
            }
          case 72: break;
          case 12: 
            { System.out.printf("RPAR [%s]\n", yytext());
            }
          case 73: break;
          case 13: 
            { System.out.printf("LSQBRA [%s]\n", yytext());
            }
          case 74: break;
          case 14: 
            { System.out.printf("RSQBRA [%s]\n", yytext());
            }
          case 75: break;
          case 15: 
            { System.out.printf("LCRBRA [%s]\n", yytext());
            }
          case 76: break;
          case 16: 
            { System.out.printf("RCRBRA [%s]\n", yytext());
            }
          case 77: break;
          case 17: 
            { System.out.printf("TYPESPEC [%s]\n", yytext());
            }
          case 78: break;
          case 18: 
            { System.out.printf("EQ [%s]\n", yytext());
            }
          case 79: break;
          case 19: 
            { System.out.printf("PLUS [%s]\n", yytext());
            }
          case 80: break;
          case 20: 
            { System.out.printf("MULT [%s]\n", yytext());
            }
          case 81: break;
          case 21: 
            { System.out.printf("MOD [%s]\n", yytext());
            }
          case 82: break;
          case 22: 
            { System.out.printf("LT [%s]\n", yytext());
            }
          case 83: break;
          case 23: 
            { System.out.printf("GT [%s]\n", yytext());
            }
          case 84: break;
          case 24: 
            { System.out.printf("NOT [%s]\n", yytext());
            }
          case 85: break;
          case 25: 
            { System.out.printf("QM [%s]\n", yytext());
            }
          case 86: break;
          case 26: 
            { System.out.printf("BOOL_LIT [%s]\n", yytext());
            }
          case 87: break;
          case 27: 
            { System.out.printf("STRING_LIT [%s]\n", yytext());
            }
          case 88: break;
          case 28: 
            { System.out.printf("DOUBLECOLON [%s]\n", yytext());
            }
          case 89: break;
          case 29: 
            { System.out.printf("ASSIGN [%s]\n", yytext());
            }
          case 90: break;
          case 30: 
            { System.out.printf("IMPLICATION [%s]\n", yytext());
            }
          case 91: break;
          case 31: 
            { System.out.printf("LEQ [%s]\n", yytext());
            }
          case 92: break;
          case 32: 
            { System.out.printf("GEQ [%s]\n", yytext());
            }
          case 93: break;
          case 33: 
            { System.out.printf("NEQ [%s]\n", yytext());
            }
          case 94: break;
          case 34: 
            { System.out.printf("AND [%s]\n", yytext());
            }
          case 95: break;
          case 35: 
            { System.out.printf("OR [%s]\n", yytext());
            }
          case 96: break;
          case 36: 
            { System.out.printf("END_IF [%s]\n", yytext());
            }
          case 97: break;
          case 37: 
            { System.out.printf("START_IF [%s]\n", yytext());
            }
          case 98: break;
          case 38: 
            { System.out.printf("PRAT_LIT [%s]\n", yytext());
            }
          case 99: break;
          case 39: 
            { System.out.printf("PFLOAT_LIT [%s]\n", yytext());
            }
          case 100: break;
          case 40: 
            { System.out.printf("CHAR_LIT [%s]\n", yytext());
            }
          case 101: break;
          case 41: 
            { System.out.printf("INT [%s]\n", yytext());
            }
          case 102: break;
          case 42: 
            { System.out.printf("LEN [%s]\n", yytext());
            }
          case 103: break;
          case 43: 
            { System.out.printf("SEQ [%s]\n", yytext());
            }
          case 104: break;
          case 44: 
            { System.out.printf("RAT [%s]\n", yytext());
            }
          case 105: break;
          case 45: 
            { System.out.printf("FDEF [%s]\n", yytext());
            }
          case 106: break;
          case 46: 
            { System.out.printf("DICT [%s]\n", yytext());
            }
          case 107: break;
          case 47: 
            { System.out.printf("ELSE [%s]\n", yytext());
            }
          case 108: break;
          case 48: 
            { System.out.printf("MAIN [%s]\n", yytext());
            }
          case 109: break;
          case 49: 
            { System.out.printf("NULL [%s]\n", yytext());
            }
          case 110: break;
          case 50: 
            { System.out.printf("TDEF [%s]\n", yytext());
            }
          case 111: break;
          case 51: 
            { System.out.printf("THEN [%s]\n", yytext());
            }
          case 112: break;
          case 52: 
            { System.out.printf("LOOP_START [%s]\n", yytext());
            }
          case 113: break;
          case 53: 
            { System.out.printf("READ [%s]\n", yytext());
            }
          case 114: break;
          case 54: 
            { System.out.printf("LOOP_END [%s]\n", yytext());
            }
          case 115: break;
          case 55: 
            { System.out.printf("BOOL [%s]\n", yytext());
            }
          case 116: break;
          case 56: 
            { System.out.printf("CHAR [%s]\n", yytext());
            }
          case 117: break;
          case 57: 
            { System.out.printf("FLOAT [%s]\n", yytext());
            }
          case 118: break;
          case 58: 
            { System.out.printf("ALIAS [%s]\n", yytext());
            }
          case 119: break;
          case 59: 
            { System.out.printf("PRINT [%s]\n", yytext());
            }
          case 120: break;
          case 60: 
            { System.out.printf("BREAK [%s]\n", yytext());
            }
          case 121: break;
          case 61: 
            { System.out.printf("RETURN [%s]\n", yytext());
            }
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}