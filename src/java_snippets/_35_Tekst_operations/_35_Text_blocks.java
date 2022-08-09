package java_snippets._35_Tekst_operations;

public class _35_Text_blocks {
    public static void main(String[] args) {
        // We can create text block without creating spaces or enters,
        // like f.e. \n to create new line

        // text block can not be single lined, like: String text = """ """;

        // 1. to create text block use triple """
        String sql =
                """
                SELECT
                    id, title, description
                FROM
                    books
                WHERE
                    author = '%s'
                """;

        // 2. also, we can format text block using any formatting patterns
        String searchTitle = "Mark Twain";
        sql = sql.formatted(searchTitle);
        System.out.println(sql);
    }

}
