package nsp;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by JangYangsook on 2016-07-05.
 */
public class ChainIdInsertService {

    @Test
    public void simpleTest() {

        String str1 = "커피";
        String str2 = "커피";

        System.out.println(str1.trim().compareTo(str2.trim()));
    }

    @Test
    public void test() {

        Calendar cal = Calendar.getInstance();
        long curTime = cal.getTimeInMillis();
        System.out.println(curTime);
    }


    public void createSqlFile(String merchantListFileName, String createdFileName) {

        List<String> merchantNoList = readMerchantNoList(merchantListFileName);
        List<String> queryList = createSqlText(merchantNoList);
        writeToFile(createdFileName, queryList);
    }

    private List<String> createSqlText(List<String> merchantNoList) {

        List<String> queryList = new ArrayList<String>();

        for(String merchantNo : merchantNoList) {

            String nextChainId = "";

            String query = "UPDATE NM_MRC_NGP_INFO set chain_id = '"+nextChainId+"', GRP_CD = 'PIZZAHUT' " +
                            "WHERE nc_mrc_no = "+merchantNo+" AND cp_id = 'NMP_'";

            queryList.add(query);
        }

        return queryList;
    }

    private List<String> readMerchantNoList(String merchantListFileName) {

        List<String> merchantNoList = new ArrayList<String>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(merchantListFileName)));

            String lineStr = null;
            while((lineStr = bufferedReader.readLine()) != null) {
                merchantNoList.add(lineStr);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                }catch(Exception ee) {ee.printStackTrace();}
            }
        }

        return merchantNoList;
    }

    private void writeToFile(String writeFileName, List<String> queryList) {

        BufferedWriter writer = null;

        try {

            writer = new BufferedWriter(new FileWriter(new File(writeFileName)));

            for(String query : queryList) {

                writer.write(query);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if(writer != null) {
                try {
                    writer.close();
                }catch(Exception ee) {ee.printStackTrace();}
            }
        }

    }
}
