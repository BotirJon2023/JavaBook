package org.example;



public class Main {
    public static void main(String[] args) {

        int i, j;
        int sequence[] = { 2, 3, 5, 6, 7 };

        public class GenerateAllPossibleSubsetsUsingLexicographicOrder {

            int binary[(int) pow(2, N)];
    for (i = 0; i < pow(2, N); i++) {
                int b = 1;
                binary[i] = 0;
                int num = i;
                while (num > 0) {
                    binary[i] += (num % 2) * b;
                    num /= 2;
                    b = b * 10;
                }
            }
            printf("\nThe permutations are: ");
    for (i = 0; i < pow(2, N); i++) {
                printf("{ ");
                for (j = 0; j < N; j++) {
                    if (binary[i] % 10 == 1)
                        printf("%d ", sequence[j]);
                    binary[i] /= 10;
                }
                printf("}\n");
            }
        }

        int main(int argc, char **argv) {
            printf("The elements in the set : ");
            for (i = 0; i < 5; i++)
                printf("%d ", sequence[i]);

            for (i = 1; i < 5; i++) {
                int j = i;
                int temp = sequence[i];
                while (j > 0 && temp < sequence[j - 1]) {
                    sequence[j] = sequence[j - 1];
                    j = j - 1;
                }
                sequence[j] = temp;
            }
            lexicographicOrder(5);

        }


    }
}