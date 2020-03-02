public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] room = new int[1000];

        for (int i = 0; i < trials; i++) {
            int index = 0;
            boolean sameBirthday = false;
            while (!sameBirthday) {
                int rn = (int) (Math.random() * n);
                room[index] = rn;

                for (int i = 0; i < index; i++) {
                    if (room[i] == rn) {
                        sameBirthday = true;
                        break;
                    }
                }
                index++;
            }

        }
    }
}