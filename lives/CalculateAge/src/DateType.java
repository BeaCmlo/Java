package lives.CalculateAge.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateType {
    private Date date = new Date();

    public DateType() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    void informarDia() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));
    }

    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dia = formatter.format(data);

        System.out.println(dia);

        try {
            Date parse = formatter.parse(dia);

            DateType dateType = new DateType();

            dateType.setDate(parse);
            System.out.println("-------------------------");
            dateType.informarDia();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}