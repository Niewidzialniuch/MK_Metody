public class zadania1 {
        public static void showChar(String cityName, int liczba){
        System.out.print(cityName.charAt(liczba-1));
    }

        public static void main(String[] args)
        {
            String cityName = "Gniezno";
            showChar(cityName, 2);
        }

    }
