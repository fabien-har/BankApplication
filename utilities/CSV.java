package utilities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV
{   public static List<String[]> read(String file)
    {   List<String[]> data = new LinkedList<String[]>() ;
        String dataRow ;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file)) ;
            while ((dataRow = br.readLine()) != null)
            {   String[] dataRecords = dataRow.split(",") ;
                data.add(dataRecords) ;
            }
        } catch (FileNotFoundException e){
            System.out.println("COULD NOT FIND") ;
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            throw new RuntimeException(e);
        }
        return data;
    }
}
