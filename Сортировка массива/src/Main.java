public class Main {
    public static void main(String[] args) {
        int size = 6; //строчки
        int stolbets = 6; //столбцы
        int[] massiv;  //создаю массив
        massiv = new int[stolbets];  //выделяю память
        for (int i = 0; i < size; i++) {
            massiv[i] = (int) (Math.random() * 101); //заполняю рандомными числами
        }

        for (int k = 0; k < size; k++) {          // сравниваю и сортирую соседние значения
            for (int j = k + 1; j < size; j++) {
                if (massiv[k] > massiv[j]) {
                    int num = massiv[k];
                    massiv[k] = massiv[j];
                    massiv[j] = num;
                }
            }
        }
                System.out.println("Отсортированный массив");
                for (int g = 0; g < size; g++) {
                    System.out.print(massiv[g] + " ");}

                    System.out.println();

            }
        }
