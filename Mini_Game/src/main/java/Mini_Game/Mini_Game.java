/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mini_Game;

import CRUD.GetSentences;
import Views.Init;
import java.io.IOException;
import org.json.JSONArray;

/**
 *
 * @author Alisser
 */
public class Mini_Game {

    public static void main(String[] args) throws IOException {
        GetSentences info = new GetSentences();
        JSONArray words = info.Words();
        System.out.println(words);
        Init initWindow = new Init();
        initWindow.setVisible(true);
        initWindow.setLocationRelativeTo(null);
    }
}
