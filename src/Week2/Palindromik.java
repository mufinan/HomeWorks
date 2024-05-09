package Week2;

public class Palindromik {
    
        // Iteratif yöntemle palindrom kontrolü
        static boolean isIterativePalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

        // Recursive (döngüsüz) yöntemle palindrom kontrolü
        static boolean isRecursivePalindrome(String str) {
            // Base case: String uzunluğu 1 veya daha küçükse palindromdur
            if (str.length() <= 1) {
                return true;
            }
            // İlk ve son karakterler eşleşmiyorsa palindrom değildir
            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                return false;
            }
            // İlk ve son karakterleri atarak recursive olarak devam et
            return isRecursivePalindrome(str.substring(1, str.length() - 1));
        }

        public static void main(String[] args) {
            // Test vakaları
            String[] testCases = {"abba", "asa", "kavak", "kayak", "hello", "world", "madam", "racecar"};

            // Her bir test vakası için sonuçları ekrana yazdır
            for (String testCase : testCases) {
                System.out.println(testCase + " is palindrome (iterative): " + isIterativePalindrome(testCase));
                System.out.println(testCase + " is palindrome (recursive): " + isRecursivePalindrome(testCase));
            }
        }
    }


