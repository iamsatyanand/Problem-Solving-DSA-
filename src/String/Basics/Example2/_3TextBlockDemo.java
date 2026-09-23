package String.Basics.Example2;

public class _3TextBlockDemo {

    public static void main(String[] args) {

        String input = "Hello, my name is John \n" +
                "and I am 25 years old.";
        System.out.println(input);

        String htmlCode = "<html>\n" +
                "<body>\n" +
                "<p>Hello World.</p>\n" +
                "</body>\n" +
                "</html>";
        System.out.println(htmlCode);

        String textBlock = """
                  <html>
                    <body>
                        <p>Hello World.</p>
                    </body>
                  </html>
                  """;

        System.out.println(textBlock);

        String textBlock1 = """
                  <html>
                  <body>
                      <!-- You can use single quotes easily -->
                      <p class='highlight'>It's a beautiful day!</p>
                      
                      <!-- You can even use normal double quotes without escaping! -->
                      <p class="bold">Hello "World".</p>
                  </body>
                  </html>
                  """;

        System.out.println(textBlock1);

        String name = "Satya";
        int age = 30;

        // A multi-line Text Block acting as a format template
        String message = """
            Hello, my name is %s
            and I am %d years old.
            """;

        // Formatting the text block with dynamic variables
        String formattedMessage = String.format(message, name, age);

        System.out.println(formattedMessage);

    }
}
