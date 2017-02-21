import java.io.FileReader;
import java.io.FileNotFoundException;
import java_cup.runtime.Symbol;

class SC {
    public static void main(String[] args) {
    	Lexer lexer;
		try {
			lexer = new Lexer(new FileReader(args[0]));
			try {
				Parser parser = new Parser(lexer);
				Symbol result = parser.parse();
				if(!parser.syntaxErrors){
					System.out.println("parsing successful");
				}
				
				
			} catch (Exception e) {
				// TODO comment out e.printStackTrace() before submitting this has been uncommented to look out for java errors
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
}
