public class Dog {
    String name;

    public static void main(String[] args) {
        //создаём обьект типа Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.name = "Барт";
        dog1.bark();
        //теперь создаём массив типа Dog
        Dog[] myDogs = new Dog[3];
        //помещаем в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //Теперь получаем доступ к обьектам Dog с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";


        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);
        //Перебираем элементы массива и вызываем для каждого метод bark
        allDogsBark(myDogs);
    }

    private static void allDogsBark(Dog[] myDogs) {
        int x = 0;
        while (x < myDogs.length) {   //переменная .length предоставляет количество хранимых элементов массива
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " Сказал гав!");
    }
}
