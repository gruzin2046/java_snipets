
    class Pair<T, V> {
        T first;
        V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public static <T, V> void printInfo(Pair<T, V> pair) {
            System.out.println("" + pair.first + ", " + pair.second);
        }

        public static void main(String[] args) {
            Pair<Integer,String> person = new Pair<>(321, "Albert");
            Pair<String,String> couple = new Pair<>("Diego", "Jessica");
            Pair<Double,Long> numbers = new Pair<>(33.33, 123_000_000_000L);

            printInfo(person);
            printInfo(couple);
            printInfo(numbers);
        }
    }

