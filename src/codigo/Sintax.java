
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Oct 20 16:12:36 CDT 2022
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;
import java_cup.runtime.*;
import java_cup.parser;
import java.io.*;
import java.io.Reader;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Oct 20 16:12:36 CDT 2022
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\011\000\002\002" +
    "\012\000\002\002\013\000\002\002\014\000\002\002\015" +
    "\000\002\002\016\000\002\002\017\000\002\002\010\000" +
    "\002\002\011\000\002\002\012\000\002\002\013\000\002" +
    "\002\014\000\002\002\011\000\002\002\012\000\002\002" +
    "\013\000\002\002\014\000\002\002\015\000\002\002\016" +
    "\000\002\002\017\000\002\003\005\000\002\003\010\000" +
    "\002\003\011\000\002\003\005\000\002\004\002\000\002" +
    "\003\010\000\002\003\006\000\002\003\010\000\002\003" +
    "\005\000\002\003\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\010\007\007\027\005\030\004\001\002\000" +
    "\004\027\111\001\002\000\004\023\074\001\002\000\004" +
    "\002\073\001\002\000\004\027\010\001\002\000\004\023" +
    "\011\001\002\000\004\024\012\001\002\000\004\025\013" +
    "\001\002\000\012\007\020\010\014\011\016\032\017\001" +
    "\002\000\004\032\062\001\002\000\014\007\020\010\014" +
    "\011\016\026\045\032\017\001\002\000\004\032\036\001" +
    "\002\000\004\016\027\001\002\000\004\032\021\001\002" +
    "\000\006\016\023\031\022\001\002\000\014\007\uffea\010" +
    "\uffea\011\uffea\026\uffea\032\uffea\001\002\000\004\033\024" +
    "\001\002\000\004\031\uffe9\001\002\000\004\031\026\001" +
    "\002\000\014\007\uffe8\010\uffe8\011\uffe8\026\uffe8\032\uffe8" +
    "\001\002\000\006\006\031\033\030\001\002\000\004\031" +
    "\035\001\002\000\004\032\032\001\002\000\004\006\033" +
    "\001\002\000\004\031\034\001\002\000\014\007\uffe6\010" +
    "\uffe6\011\uffe6\026\uffe6\032\uffe6\001\002\000\014\007\uffe7" +
    "\010\uffe7\011\uffe7\026\uffe7\032\uffe7\001\002\000\006\016" +
    "\040\031\037\001\002\000\014\007\uffe5\010\uffe5\011\uffe5" +
    "\026\uffe5\032\uffe5\001\002\000\004\033\041\001\002\000" +
    "\004\012\042\001\002\000\004\033\043\001\002\000\004" +
    "\031\044\001\002\000\014\007\uffe4\010\uffe4\011\uffe4\026" +
    "\uffe4\032\uffe4\001\002\000\004\002\000\001\002\000\014" +
    "\007\020\010\014\011\016\026\047\032\017\001\002\000" +
    "\004\002\uffff\001\002\000\014\007\020\010\014\011\016" +
    "\026\051\032\017\001\002\000\004\002\ufffe\001\002\000" +
    "\014\007\020\010\014\011\016\026\053\032\017\001\002" +
    "\000\004\002\ufffd\001\002\000\014\007\020\010\014\011" +
    "\016\026\055\032\017\001\002\000\004\002\ufffc\001\002" +
    "\000\014\007\020\010\014\011\016\026\057\032\017\001" +
    "\002\000\004\002\ufffb\001\002\000\004\026\061\001\002" +
    "\000\004\002\ufffa\001\002\000\006\016\064\031\063\001" +
    "\002\000\014\007\uffed\010\uffed\011\uffed\026\uffed\032\uffed" +
    "\001\002\000\004\006\065\001\002\000\006\006\066\032" +
    "\067\001\002\000\004\031\072\001\002\000\004\006\070" +
    "\001\002\000\004\031\071\001\002\000\014\007\uffeb\010" +
    "\uffeb\011\uffeb\026\uffeb\032\uffeb\001\002\000\014\007\uffec" +
    "\010\uffec\011\uffec\026\uffec\032\uffec\001\002\000\004\002" +
    "\001\001\002\000\004\024\075\001\002\000\004\025\076" +
    "\001\002\000\012\007\020\010\014\011\016\032\017\001" +
    "\002\000\014\007\020\010\014\011\016\026\100\032\017" +
    "\001\002\000\004\002\ufff9\001\002\000\014\007\020\010" +
    "\014\011\016\026\102\032\017\001\002\000\004\002\ufff8" +
    "\001\002\000\014\007\020\010\014\011\016\026\104\032" +
    "\017\001\002\000\004\002\ufff7\001\002\000\014\007\020" +
    "\010\014\011\016\026\106\032\017\001\002\000\004\002" +
    "\ufff6\001\002\000\004\026\110\001\002\000\004\002\ufff5" +
    "\001\002\000\004\023\112\001\002\000\004\024\113\001" +
    "\002\000\004\025\114\001\002\000\012\007\020\010\014" +
    "\011\016\032\017\001\002\000\014\007\020\010\014\011" +
    "\016\026\116\032\017\001\002\000\004\002\ufff4\001\002" +
    "\000\014\007\020\010\014\011\016\026\120\032\017\001" +
    "\002\000\004\002\ufff3\001\002\000\014\007\020\010\014" +
    "\011\016\026\122\032\017\001\002\000\004\002\ufff2\001" +
    "\002\000\014\007\020\010\014\011\016\026\124\032\017" +
    "\001\002\000\004\002\ufff1\001\002\000\014\007\020\010" +
    "\014\011\016\026\126\032\017\001\002\000\004\002\ufff0" +
    "\001\002\000\014\007\020\010\014\011\016\026\130\032" +
    "\017\001\002\000\004\002\uffef\001\002\000\004\026\132" +
    "\001\002\000\004\002\uffee\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\014\001\001\000\002\001\001\000\004\003\045\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\024\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\003\047\001\001" +
    "\000\002\001\001\000\004\003\051\001\001\000\002\001" +
    "\001\000\004\003\053\001\001\000\002\001\001\000\004" +
    "\003\055\001\001\000\002\001\001\000\004\003\057\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\076" +
    "\001\001\000\004\003\100\001\001\000\002\001\001\000" +
    "\004\003\102\001\001\000\002\001\001\000\004\003\104" +
    "\001\001\000\002\001\001\000\004\003\106\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\114\001\001\000\004\003\116\001\001\000\002\001\001" +
    "\000\004\003\120\001\001\000\002\001\001\000\004\003" +
    "\122\001\001\000\002\001\001\000\004\003\124\001\001" +
    "\000\002\001\001\000\004\003\126\001\001\000\002\001" +
    "\001\000\004\003\130\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public static void main(String args[]) throws Exception{          
        parser r = new parser();
        new parser(new LexerCup(new FileInputStream(args[0]))).parse();     
        System.out.println("Parseo finalizado");
    }
    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {


    TablaSimbolos ta = new TablaSimbolos();     

    int valido=1;

  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA ::= Float Identificador Igual Numero Punto Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // SENTENCIA ::= Float Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SENTENCIA ::= Identificador Igual Comilla Identificador Comilla P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SENTENCIA ::= Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SENTENCIA ::= Int Identificador Igual Numero NT$0 P_coma 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int i1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).right;
		Object i1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NT$0 ::= 
            {
              Object RESULT =null;
		int i1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object i1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
 RESULT= i1.toString(); ta= new TablaSimbolos(); 
    ta.crearEntrada(i1.toString(), "VARIABLE"); ta.setValor(i1.toString(),e1.toString()); ta.Imprimir();  
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("NT$0",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SENTENCIA ::= Int Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // SENTENCIA ::= Char Identificador Igual Comilla Identificador Comilla P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA ::= Char Identificador Igual Comilla Comilla P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA ::= Char Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-12)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-11)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // INICIO ::= Void Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-12)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-11)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-9)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

