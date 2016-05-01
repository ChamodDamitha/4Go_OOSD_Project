/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DakshinaLankaProject;

/**
 *
 * @author Chamod
 */
public class MathClass {
        
    static int intBool(boolean b)
    {
        if(b)return 1;
        return 0;
    }
    
    static boolean boolInt(int i)
    {
        if(i==1)return true; 
        return false;
    }
    
    static boolean boolString(String s)
    {
        if(s=="Yes")return true;
        return false;
    }
}
