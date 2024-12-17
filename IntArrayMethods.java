public class IntArrayMethods {

public static int arraySum(int[] a) {
int sum = 0;
for (int num : a) {
sum += num;
}
return sum;
}

public static double arrayMean(int[] a) {
if (a.length == 0) return 0.0;
return (double) arraySum(a) / a.length;
}

public static int arrayMin(int[] a) {
if (a.length == 0) throw new IllegalArgumentException("Array cannot be empty.");
int min = a[0];
for (int num : a) {
if (num < min) {
min = num;
}
}
return min;
}

public static int arrayMax(int[] a) {
if (a.length == 0) throw new IllegalArgumentException("Array cannot be empty.");
int max = a[0];
for (int num : a) {
if (num > max) {
max = num;
}
}
return max;
}

public static boolean[] arrayLocalMin(int[] a) {
boolean[] result = new boolean[a.length];
if (a.length < 3) return result;
for (int i = 1; i < a.length - 1; i++) {
if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
result[i] = true;
}
}
return result;
}

public static boolean[] arrayLocalMax(int[] a) {
boolean[] result = new boolean[a.length];
if (a.length < 3) return result;
for (int i = 1; i < a.length - 1; i++) {
if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
result[i] = true;
}
}
return result;
}

public static int arrayMode(int[] a) {
if (a.length == 0) throw new IllegalArgumentException("Array cannot be empty.");
int mode = a[0];
int maxCount = 0;
for (int i = 0; i < a.length; i++) {
int count = 0;
for (int j = 0; j < a.length; j++) {
if (a[j] == a[i]) {
count++;
}
}
if (count > maxCount) {
mode = a[i];
maxCount = count;
}
}
return mode;
}

public static int arrayCount(int[] a, int b) {
int count = 0;
for (int num : a) {
if (num == b) {
 count++;
}
}
return count;
}

public static boolean arrayContainsDuplicates(int[] a) {
for (int i = 0; i < a.length; i++) {
for (int j = i + 1; j < a.length; j++) {
if (a[i] == a[j]) {
return true;
}
}
}
return false;
}

public static boolean arrayAllEqual(int[] a) {
if (a.length == 0) return true;
int first = a[0];
for (int num : a) {
if (num != first) {
return false;
}
}
return true;
}

public static double[] arrayRollingAverage(int[] a, int b) {
double[] result = new double[a.length];
for (int i = 0; i < a.length; i++) {
int count = 0;
double sum = 0;
 for (int j = i; j >= 0 && count < b; j--) {
sum += a[j];
count++;
 }
result[i] = sum / count;
}
return result;
}

public static int[] arrayShift(int[] a, int b) {
int[] result = new int[a.length];
for (int i = 0; i < a.length; i++) {
result[(i + b) % a.length] = a[i];
}
return result;
}

public static int[] arrayReverse(int[] a) {
int[] result = new int[a.length];
for (int i = 0; i < a.length; i++) {
result[i] = a[a.length - 1 - i];
}
return result;
}
}