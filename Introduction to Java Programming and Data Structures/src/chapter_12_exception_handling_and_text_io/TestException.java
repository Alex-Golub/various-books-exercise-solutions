package chapter_12_exception_handling_and_text_io;

class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex);

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                StackTraceElement traceElement = traceElements[i];
                System.out.print("method " + traceElement.getMethodName());
                System.out.print("(" + traceElement.getClassName() + ":");
                System.out.println(traceElement.getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) {
            result += list[i];
        }
        return result;
    }
}
