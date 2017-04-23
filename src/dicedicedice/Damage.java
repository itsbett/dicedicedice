package dicedicedice;

/*
 * Front end that check's syntax of input before computing input with dmg(string)
 */
public class Damage {
	public static int dmg(String str) {
		if (Syntax.good(str)) { // checks syntax
			return DamageEvaluator.eval(str); // Parses and computes mathematics
		} else {
			throw new IllegalArgumentException(
					"Illegal character(s)! Allowed chars: 0-9,*,/,-,+,d,(,),sqrt,cos,sin,tan");
		}
	}
}
