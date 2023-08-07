public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трёх-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "проникающий", "умный", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "оріентірованный", "кластеризированный", "позиционированный", "сетевой", "выровненный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "подход", "период времени", "обзор", "образец", "талант", "тип структуры", "портал"};

        int oneLegth = wordListOne.length;
        int twoLegth = wordListTwo.length;
        int threeLegth = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLegth);
        int rand2 = (int) (Math.random() * twoLegth);
        int rand3 = (int) (Math.random() * threeLegth);

        String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree [rand3];
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
