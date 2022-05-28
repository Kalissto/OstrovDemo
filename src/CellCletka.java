import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CellCletka {
    public static List<Animal> animals;
    public static boolean proverka;
    public static int Step;
    public static Random random = new Random();

    public static List<Animal> listAnimalRandom() {//заполнили лист животных

        int t = random.nextInt(30);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(i, new Wolf(50, 30, 3, 1));//сначала добавили в лист волков рандом кол во c параметрами

            Wolf.count++;//считаем общее кол во созданных волков
        }
        int h = random.nextInt(150);//сдесь указываем максимальное кол во обьекта на клетке
        for (int i = 0; i < h; i++) {
            list.add(i, new Zayac(2, 150, 2, 1));//затем добавили рандо майцев
            Zayac.count++;//ситаем количество зайцев на поле
        }

        int t1 = random.nextInt(200);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t1; i++) {
            list.add(i, new Grass(1, 200));//сначала добавили в лист волков рандом кол во c параметрами
            Grass.count++;
        }

        int t2 = random.nextInt(30);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t2; i++) {
            list.add(i, new Udav(15, 30, 1, 3));//сначала добавили в лист волков рандом кол во c параметрами
            Udav.count++;
        }

        int t3 = random.nextInt(30);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t3; i++) {
            list.add(i, new Fox(8, 30, 2, 2));//сначала добавили в лист волков рандом кол во c параметрами
            Fox.count++;
        }

        int t4 = random.nextInt(5);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t4; i++) {
            list.add(i, new Bear(500, 5, 2, 80));//сначала добавили в лист волков рандом кол во c параметрами
            Bear.count++;
        }

        int t5 = random.nextInt(20);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t5; i++) {
            list.add(i, new Eagle(6, 20, 3, 1));//сначала добавили в лист волков рандом кол во c параметрами
            Eagle.count++;
        }

        int t6 = random.nextInt(20);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t6; i++) {
            list.add(i, new Horse(400, 20, 4, 60));//сначала добавили в лист волков рандом кол во c параметрами
            Horse.count++;
        }

        int t7 = random.nextInt(20);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t7; i++) {
            list.add(i, new Deer(300, 20, 4, 50));//сначала добавили в лист волков рандом кол во c параметрами
            Deer.count++;
        }

        int t8 = random.nextInt(500);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t8; i++) {
            list.add(i, new Mouse(1, 500, 1, 1));//сначала добавили в лист волков рандом кол во c параметрами
            Mouse.count++;
        }

        int t9 = random.nextInt(140);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t9; i++) {
            list.add(i, new Goat(60, 140, 3, 10));//сначала добавили в лист волков рандом кол во c параметрами
            Goat.count++;
        }

        int t10 = random.nextInt(140);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t10; i++) {
            list.add(i, new Sheep(70, 140, 3, 15));//сначала добавили в лист волков рандом кол во c параметрами
            Sheep.count++;
        }

        int t11 = random.nextInt(50);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t11; i++) {
            list.add(i, new Kangaroo(400, 50, 2, 50));//сначала добавили в лист волков рандом кол во c параметрами
            Kangaroo.count++;
        }

        int t12 = random.nextInt(10);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t12; i++) {
            list.add(i, new Cow(700, 10, 3, 100));//сначала добавили в лист волков рандом кол во c параметрами
            Cow.count++;
        }

        int t13 = random.nextInt(200);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t13; i++) {
            list.add(i, new Duck(1, 200, 4, 1));//сначала добавили в лист волков рандом кол во c параметрами
            Duck.count++;
        }

        int t14 = random.nextInt(1000);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
        for (int i = 0; i < t14; i++) {
            list.add(i, new Caterpillar(1, 1000));//сначала добавили в лист волков рандом кол во c параметрами
            Caterpillar.count++;
        }

        Collections.shuffle(list);//перемешать список обектов

        return list;
    }//рандомное заполнение списка List

    public static void randomZapolneniePolyaObectami() {

        for (int i = 0; i < Animal.objects.length; i++) {
            for (int j = 0; j < Animal.objects[i].length; j++) {
                Animal.objects[i][j] = listAnimalRandom();
            }
        }

    }//заполнили поле игровое листами с обьектами рандомно

    public static void primenenieMetodovZivotnixKlistam() {
        for (int i = 0; i < Animal.objects.length; i++) {
            for (int j = 0; j < Animal.objects[i].length; j++) {
                animals = (List<Animal>) Animal.objects[i][j];

                for (int k = 0; k < animals.size(); k++) {
                    animals.get(k).eat();
                }
                for (int k = 0; k < animals.size(); k++) {
                    animals.get(k).dead();
                }
                int a = animals.size();
                for (int k = 0; k < a; k++) {//надо не фиксировать
                    animals.get(k).razmno();
                }
                for (int k = 0; k < animals.size(); k++) {
                    animals.get(k).dvigatsa();
                }
            }
        }
    }


    public static void proverkaOstanovki() {
        if (Wolf.count <= 0 || Zayac.count <= 0 || Bear.count == 0 || Cow.count == 0 || Deer.count == 0 || Duck.count == 0 || Eagle.count == 0 || Fox.count == 0 || Goat.count == 0 || Horse.count == 0 || Kangaroo.count == 0 || Mouse.count == 0 || Sheep.count == 0 || Udav.count == 0) {
            proverka = true;
        }

    }

    public static void statistic() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Step: " + Step);
        System.out.print("WOLF:" + Wolf.count + "   ");
        System.out.print("UDAV: " + Udav.count + "   ");
        System.out.print("FOX: " + Fox.count + "   ");
        System.out.print("BEER: " + Bear.count + "   ");
        System.out.println("EAGLE: " + Eagle.count + "   ");
        System.out.print("HORSE: " + Horse.count + "   ");
        System.out.print("DEER: " + Deer.count + "   ");
        System.out.print("ZAYAC: " + Zayac.count + "   ");
        System.out.print("MOUSE: " + Mouse.count + "   ");
        System.out.println("GOAT: " + Goat.count + "   ");
        System.out.print("SHEEP: " + Sheep.count + "   ");
        System.out.print("KANGAROO: " + Kangaroo.count + "   ");
        System.out.print("COW: " + Cow.count + "   ");
        System.out.print("DUCK: " + Duck.count + "   ");
        System.out.print("CATERPILLAR: " + Caterpillar.count + "   ");
        System.out.println("GRASS: " + Grass.count + "   ");
        System.out.println("-----------------------------------------------------------------------------------");

    }
    public static void rostTravi(){
        for (int i = 0; i < Animal.objects.length; i++) {
            for (int j = 0; j < Animal.objects[i].length; j++) {
                int t2 = random.nextInt(100);//размер списка рандомн сдесь указыаем максимальное кол во на клетке
                List<Animal> r = (List<Animal>) Animal.objects[i][j];
                for (int l = 0; l < t2; l++) {
                    r.add(new Grass(1, 200));//сначала добавили в лист волков рандом кол во c параметрами
                    Grass.count++;
                }

            }
        }
    }
}