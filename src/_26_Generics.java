
    class _26_Generics <T, V> {
        T first;
        V second;

        public _26_Generics(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public static <T, V> void printInfo(_26_Generics<T, V> pair) {
            System.out.println("" + pair.first + ", " + pair.second);
        }

        public static void main(String[] args) {
            _26_Generics<Integer,String> person = new _26_Generics<>(321, "Albert");
            _26_Generics<String,String> couple = new _26_Generics<>("Diego", "Jessica");
            _26_Generics<Double,Long> numbers = new _26_Generics<>(33.33, 123_000_000_000L);

            printInfo(person);
            printInfo(couple);
            printInfo(numbers);
        }
    }

