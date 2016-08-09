package Task4;

public class Regular {
/*
 * Написать  программу,  выполняющую  поиск  в  строке  всех  тегов  абзацев,  в  т.ч.  
 * тех,  у  которых  есть  параметры,  например  <p  id=”p1”>, 
 *  и замену их на простые теги абзацев <p> (атрибуты игнорируем).
 */
	public static void main(String[] args) {
		String input = ("<p align1=left>абзац выровнен влево...</p> + <p align=right>абзац выровнен вправо...</p> <p align=center>абзац выровнен по центру...</p> <p align=justify> абзац выровнен по ширине...</p>");
		String myStr = input.replaceAll("<p(\\w*\\s*=*)*> *(\\w*)", "<p>");
		System.out.println(myStr);
	}
}
