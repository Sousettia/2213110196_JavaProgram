import javax.swing.JOptionPane;

public class BookDemo2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Input author name:");
        String email = JOptionPane.showInputDialog(null,"Input author email:");
        String title = JOptionPane.showInputDialog(null,"Input book title:");
        int page = Integer.parseInt(JOptionPane.showInputDialog(null, "Input book page"));
        int result = JOptionPane.showConfirmDialog(null, "Is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
       
        Book1 book = new Book1(title,new Author1(name,email),page);
        
        while(result == JOptionPane.NO_OPTION){
            book.setPage(Integer.parseInt(JOptionPane.showInputDialog(null, "Input book page, again")));
            result = JOptionPane.showConfirmDialog(null, "Is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
        }
        JOptionPane.showMessageDialog(null, "Book Title : "+book.getTitle()+
                                                            "\nAuthor name : "+book.getAuthor().getName()+" ("+book.getPage()+" page)"+
                                                            "\nAuthor e-mail : "+book.getAuthor().getEmail());
    }
}
