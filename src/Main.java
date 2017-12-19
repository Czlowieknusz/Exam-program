import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class Main extends JFrame implements ActionListener {

    private CirclePanel circlePanel;

    private JButton infoButton = new JButton("O autorze");
    private JButton resetButton = new JButton("Restart licznika");
    private JButton addButton = new JButton("Dodaj element");
    private JButton removeButton = new JButton("Usuń element");
    private JButton removeAllButton = new JButton("Wyczyść zbiór");
    private JTextField licznik = new JTextField("00:00");
    private JTable tabela;

    private Counter counter;

    public Main() {
        super("Jan Woźniak");
        setSize(new Dimension(640, 640 / 12 * 9));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        infoButton.addActionListener(this);
        resetButton.addActionListener(this);
        addButton.addActionListener(this);
        removeButton.addActionListener(this);
        removeAllButton.addActionListener(this);

        licznik.setEditable(false);

        circlePanel = new CirclePanel();
        circlePanel.setFocusable(true);
        circlePanel.addMouseListener(circlePanel);
        circlePanel.addMouseMotionListener(circlePanel);

        circlePanel.add(infoButton);
        circlePanel.add(licznik);
        circlePanel.add(resetButton);
        circlePanel.add(addButton);
        circlePanel.add(removeButton);
        circlePanel.add(removeAllButton);
        circlePanel.add(tabela);

        counter = new Counter(this);
        counter.start();

        setContentPane(circlePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    public void convertLongToDate(Long elapsedTime) {
        Date date = new Date(elapsedTime);
        DateFormat formatter = new SimpleDateFormat("mm:ss");
        String dateFormatted = formatter.format(date);
        setTimer(dateFormatted);
    }

    public void setTimer(String currentTime) {
        licznik.setText("" + currentTime);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == infoButton)
            JOptionPane.showMessageDialog(this, "Jan Woźniak, 234995");
        if (zrodlo == resetButton) {
            counter = new Counter(this);
            counter.start();
        }
        if (zrodlo == addButton) {
        }
    }
}
