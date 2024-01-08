package ru.textanalysis.tawt.example;

import ru.textanalysis.tawt.ms.model.sp.Sentence;
import ru.textanalysis.tawt.sp.api.SyntaxParser;

public class Test {
	public static void main(String[] args) {
		SyntaxParser sp = new SyntaxParser();
		sp.init();
		{
			Sentence phrase = sp.getTreeSentence("Стало ясно, что будет с российской валютой. кппупы. fhdfh. &*&");
			System.out.println(phrase);
		}

		{
			Sentence phrase = sp.getTreeSentence("Стало ясно, что будет с российской валютой. Мама мыла рамую.");
			System.out.println(phrase);
		}

		{
			Sentence phrase = sp.getTreeSentence("Давно замечено, что каждый художник в творчестве своем " +
				"как бы отражает один определенный человеческий возраст. Гончаров и в самых юношеских своих " +
				"произведениях был стариком. Юноша Лермонтов все время был взрослым человеком. Взрослый Пушкин " +
				"до конца жизни оставался юношей. Во Льве Толстом мы имеем редкий пример, где художник все время " +
				"остается ребенком. Ребенком не только в отношении своем к \"добру\", а во всех характернейших " +
				"особенностях ребенка – в радостной свежести чувства, в пенящемся сознании жизни, в чистоте отношения " +
				"к жизни, в ощущении таинственной ее значительности, даже... даже в самом слоге. ");
			System.out.println(phrase);
		}

		{
			Sentence phrase = sp.getTreeSentence("Ребенком не только в отношении своем к \"добру\", а во всех " +
				"характернейших особенностях ребенка – в радостной свежести чувства, в пенящемся сознании жизни,  " +
				"в ощущении таинственной ее значительности, в чистоте отношения к жизни, даже... даже в самом слоге. " +
				"Юноша Лермонтов все время был взрослым человеком. Давно замечено, что каждый художник в творчестве " +
				"своем как бы отражает один определенный человеческий возраст. Гончаров и в самых юношеских своих " +
				"произведениях был стариком. Взрослый Пушкин до конца жизни оставался юношей. Во Льве Толстом мы имеем " +
				"редкий пример, где художник все время остается ребенком.");
			System.out.println(phrase);
		}

		{
//			Sentence phrase = sp.getTreeSentence("\"- Нет, знаешь, я не верю этому, чтобы мы были в животных, " +
//				"- сказала Наташа тем же шепотом, хотя и музыка кончилась, - а я знаю, наверное, что мы были ангелами " +
//				"там где-то и здесь были, и от этого все помним. \n" +
//				"- Ежели бы мы были ангелами, так за что же мы попали ниже? – сказал Николай. – Нет, этого не может быть. \n" +
//				"- Не ниже, кто тебе сказал, что ниже? Почему я знаю, чем была прежде, - с убеждением возразила Наташа\". \n" +
//				"\"Не ниже ангелов\"... Это не девушка взболтнула, не зная, что говорит. Это душа Толстого сказала. " +
//				"Потому что именно Наташа-то и есть подлинная душа Толстого. \n" +
//				"Ничем несокрушимая вера в светлое существо человеческой души - это одно из самых характерных " +
//				"особенностей Толстого. \"Человек -это то, чему не может быть оценки, выше чего ничего нет\", - говорит он. \n" +
//				"Эта-то вера лежит в основе и его позднейшего учения о непротивлении злу... ");
//			System.out.println(phrase);
		}

		{
			Sentence phrase = sp.getTreeSentence("— Нет, знаешь, я не верю этому, чтобы мы были в животных," +
				" — сказала Наташа тем же шопотом, хотя музыка и кончилась, — а я знаю наверное, что мы были ангелами " +
				"там где-то и здесь были, и от этого всё помним… — Ежели бы мы были ангелами, так за что же мы попали " +
				"ниже? — сказал Николай. — Нет, это не может быть! — Не ниже, кто тебе сказал, что ниже?… Почему я знаю, " +
				"чем я была прежде, — с убеждением возразила Наташа. — Ведь душа бессмертна… стало быть, ежели я буду" +
				" жить всегда, так я и прежде жила, целую вечность жила.");

			System.out.println(phrase);
		}

		{
			Sentence phrase = sp.getTreeSentence("лёгок, лёгкий");
			System.out.println(phrase);
		}
	}
}
