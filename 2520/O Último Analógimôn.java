import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = Integer.parseInt(sc.next().trim());
            int M = Integer.parseInt(sc.next().trim());
            int[][] matrix = new int[N][M];
            int xA = 0, yA = 0;
            int xP = 0, yP = 0;
            int horizontal = 0;
            int vertical = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = Integer.parseInt(sc.next().trim());
                    if (matrix[i][j] == 1) {
                        xA = i;
                        yA = j;
                    }
                    if (matrix[i][j] == 2) {
                        xP = i;
                        yP = j;
                    }
                }
            }

            if (xA >= xP) {
                for (int i = xA; i >= 0; i--) {
                    if (yA >= yP) {
                        for (int j = yA; j >= 0; j--) {
                            horizontal++;
                            // System.out.println(i + " " + j);
                            if (matrix[i][j] == 2) {
                                System.out.println((vertical + horizontal - 1));
                            }

                        }
                        vertical++;
                        horizontal = 0;
                    } else if (yA < yP) {
                        for (int j = yA; j < M; j++) {
                            horizontal++;
                            // System.out.println(i + " " + j);
                            if (matrix[i][j] == 2) {
                                System.out.println((vertical + horizontal - 1));
                            }
                        }
                        vertical++;
                        horizontal = 0;
                    }

                }

            } else if (xA < xP) {
                for (int i = xA; i < N; i++) {
                    if (yA >= yP) {
                        for (int j = yA; j >= 0; j--) {
                            horizontal++;
                            // System.out.println(i + " " + j);
                            if (matrix[i][j] == 2) {
                                System.out.println((vertical + horizontal - 1));
                            }

                        }
                        vertical++;
                        horizontal = 0;
                    } else if (yA < yP) {
                        for (int j = yA; j < M; j++) {
                            horizontal++;
                            // System.out.println(i + " " + j);
                            if (matrix[i][j] == 2) {
                                System.out.println((vertical + horizontal - 1));
                            }
                        }
                        vertical++;
                        horizontal = 0;
                    }

                }
            }

        }

        sc.close();

    }

}

