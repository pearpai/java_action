package com.action.netty.zip.test;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelFuture;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * Summary:
 *
 * @author wuyunfeng
 * @date 16. 1月 2020 10:33 上午
 */
@Slf4j
public class ZipTest {

    public static int readFileByLine(ChannelFuture cf, String filePath) {


        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);


            String str = null;

            int i = 0;
            while ((str = br.readLine()) != null) {
                String[] strs = str.split(",");
                if (strs[1].substring(0, 2).equals("03")) {
                    InventoryDataDTO dto = new InventoryDataDTO(strs[0], strs[1]);

                    if (cf.channel().isActive()) {

                        cf.channel().writeAndFlush(JSON.toJSONString(dto));
                        i++;
                    }

                }

            }
            System.out.println("count is ---->" + i);
            br.close();

            reader.close();
            return i;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }


    public static void sendData(ChannelFuture cf) {
        String path = "/Users/wuyunfeng/Downloads/neida_udp_1_10/";
        File file = new File(path);
        File[] tempList = file.listFiles();
        int total = 0;
        for (File aTempList : tempList) {
            System.out.println(aTempList.getName());

            total += readFileByLine(cf, path + aTempList.getName());

        }
        System.out.println("total------>" + total);
    }


    public static void sendDataStr(ChannelFuture cf,String time, String str){

        InventoryDataDTO dto = new InventoryDataDTO(time, str);
        cf.channel().writeAndFlush(JSON.toJSONString(dto));

    }


    public static void main(String[] args) {
//        readFileByLine();


    }


}
