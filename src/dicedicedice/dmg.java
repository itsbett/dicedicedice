package dicedicedice;

//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class dmg {

	public static void main(String[] args) throws ScriptException {
			System.out.println(damage("1d8+3"));
	}
	public static double damage(String str) {
		if (syntax.good(str)) {
		str = CatchingDice.diceParse(str); //Evaluate Dice Rolls
		return altEvaluator.eval(str); //Compute Mathematics
		} else {
			System.out.println("Shit fucked up.");
			return 0;
		}
	}
	/* --This uses a Script Engine to compute the Mathematics--
	public static Object damage(String str) throws ScriptException {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		str = CatchingDice.diceParse(str);
		return engine.eval(str);
	}
	*/
}
