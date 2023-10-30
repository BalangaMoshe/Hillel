package HomeWokr;

import java.util.Arrays;
import java.util.Random;

public class Regbi {
    public static void main(String[] args) {
        int[] teamBulls = new int[25];
        int[] teamHorses = new int[25];
        int sumBulls = 0;
        int sumHorses = 0;

        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int randomNumer = random.nextInt(23) + 18;
            teamBulls[i] = randomNumer;
            System.out.print(teamBulls[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < teamBulls.length; i++) {
            sumBulls += teamBulls[i];
        }
        System.out.println("Сумма всього віку з 25 гравців команди BULLS " + sumBulls);
        System.out.println("Средній вік гравців команди BULLS " + sumBulls / teamBulls.length);
        System.out.println();


        for (int i = 0; i < 25; i++) {
            int randomNumer2 = random.nextInt(23) + 18;
            teamHorses[i] = randomNumer2;
            System.out.print(teamHorses[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < teamHorses.length; i++) {
            sumHorses += teamHorses[i];

        }
        System.out.println("Сумма всього віку з 25 гравців команди HORSES " + sumHorses);
        System.out.println("Средній вік гравців команди HORSES " + sumHorses / teamHorses.length);

    }
}



       /* int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
        
            System.out.println(array[i]);  } */
/////////////////////////////////////
      /*  int[] arrray1 = {1, 2, 3, 4, 5};
        for (int hrinnnn : arrray1) {
            //System.out.println(hrinnnn);

        }
        for (int i = 0; i < arrray1.length; i++) {
            if (arrray1[i] == 3) {
                arrray1[i] = 55;
            }
            System.out.println(Arrays.toString(arrray1));//вывести все с масива

        }*/////////////////////////////////

//        int[] massif = new int[10];
//        int random = (int) (Math.random() * 11);
//        for (int i = 0; i < massif.length ; i++) {
//            massif[i] = random;
//           // System.out.println(i);
//        }
//        for (int i = 0; i <massif.length ; i++) {
//            if (i == massif.length -1) {
//                System.out.print(massif[i]);
//            }else{
//                System.out.print(massif[i] + ", ");}
//
//        }

/////////////////////////
//        int indexMax = 0;
//        int maxVelue = 0;
//
//        int[] people = {11, 2, 55, 88, 66, 3, 45, 85, 99, 44};
//        for (int i = 0; i <people.length; i++) {
//            if (people[i] > maxVelue)
//                maxVelue = people[i];
//            indexMax = i;
//
//        }
//        System.out.println(" indeks = " + indexMax + "; maxVelue " + maxVelue);
/////////////////////////////////////////////
//        int[] team1 = new int[10];
//        for (int i = 0; i < team1.length; i++) {
//            int random = (int) (Math.random() * 101);
//            if (random >= 18 && random <=40){
//                team1[i] = random;
//            }
//
//
//       }
//        System.out.println(Arrays.toString(team1));

//        int SumTeamMain = 0;
//        int SumTeamReserv = 0;
//        for (int i = 0; i < allPeople.length; i++) {
//            if (i % 2 == 0) {
//                SumTeamMain += allPeople[i];
//            } else{
//                SumTeamReserv += allPeople[i];
//            }
//
//        }
//        System.out.println("Team Main " + SumTeamMain);
//        System.out.println("Team Reserv " + SumTeamReserv);

