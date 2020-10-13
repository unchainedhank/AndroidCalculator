package com.nopalyer.calculator;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_del, btn_leftPar,btn_PandM,
            btn_squ2,btn_sin,btn_cos,btn_div,btn_mul,
            btn_sub,btn_add,btn_equ,btn_p;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 =  findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 =  findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 =  findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 =  findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 =  findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 =  findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 =  findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 =  findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 =  findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 =  findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear =  findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        btn_percent =  findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener(this);

        btn_del =  findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);

        btn_leftPar =  findViewById(R.id.btn_leftbra);
        btn_leftPar.setOnClickListener(this);


        btn_PandM =  findViewById(R.id.btn_PandM);
        btn_PandM.setOnClickListener(this);

        btn_squ2 =  findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);

        btn_sin =  findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(this);

        btn_cos =  findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(this);

        btn_div =  findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul =  findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub =  findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add =  findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ =  findViewById(R.id.btn_equ);

        btn_equ.setOnClickListener(this);

        btn_p = findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);

        text= findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        switch(v.getId()){
            case R.id.btn_del:
                if(str.length()>1){
                    str=str.substring(0,str.length()-1);
                }
                else{
                    str="0";
                }
                text.setText(str);
                break;
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            case R.id.btn_p:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast toast = Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            case R.id.btn_add:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast toast = Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else{
                    str+="+";
                    text.setText(str);
                }
                break;
            case R.id.btn_sub:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast toast = Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else {
                    str += "-";
                    text.setText(str);
                }
                break;
            case R.id.btn_mul:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast toast = Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else {
                    str += "×";
                    text.setText(str);
                }
                break;
            case R.id.btn_div:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast toast = Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else {
                    str += "÷";
                    text.setText(str);
                }
                break;
            case R.id.btn_leftbra:
                if (str.length()==1){
                    str="(";
                }
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                    str="("+str;
                }
                else {
                    str += "(";
                }
                text.setText(str);
                break;

            case R.id.btn_equ:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'){
                    Toast toast = Toast.makeText(MainActivity.this,"表达式未完成",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText(str);
                }
                else {
                    String ero = isMatched(str);
                    if (ero.equals("no error")) {
                        String re = getResult();
                        if (re.contains("Infinity")) {
                            Toast toast = Toast.makeText(MainActivity.this,"0不能做除数",Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                            text.setText("0");
                        } else {
                            text.setText(re);
                        }
                    } else {
                        Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast toast = Toast.makeText(MainActivity.this,"负数不能开根号",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText("0");
                }
                else if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")){
                    Toast toast = Toast.makeText(MainActivity.this,"符号不能做运算",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    text.setText("0");
                }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_percent:
                double per=Double.parseDouble(str);
                per=per/100;
                String per1=""+per;
                per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(per1);
                break;
            case R.id.btn_sin:
                double sinn=Double.parseDouble(str);
                sinn=Math.toRadians(sinn);
                sinn=Math.sin(sinn);
                String sinn1=String.format("%.9f",sinn);//规避极小误差
                sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(sinn1);
                break;
            case R.id.btn_cos:
                double coss=Double.parseDouble(str);
                coss=Math.toRadians(coss);
                coss=Math.cos(coss);
                String coss1=String.format("%.9f",coss);//规避极小误差
                coss1 = coss1.replaceAll("0+?$", "");//去掉多余的0
                coss1 = coss1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(coss1);
                break;
            case R.id.btn_PandM:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack= new Stack<>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        int i=0;
        while(i<infix.length()){
            char ch=infix.charAt(i);
            switch(ch){
                case '+':
                case '-':
                    while(!stack.isEmpty()&&!stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch+""); //ch入栈
                    i++;
                    break;

                case '×':
                case '÷':
                    while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;
                    break;

                case '(':
                    stack.push(ch+""); //直接入栈
                    i++;
                    break;

                case ')':
                    String out=stack.pop();
                    while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
                        postfix.append(out);   //添加到后缀表达式串
                        out=stack.pop();   //把此时位于栈顶的"("弹出
                    }
                    i++;
                    break;

                default:
                    while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                        postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                        i++;
                        if(i<infix.length())
                            ch=infix.charAt(i);
                    }
                    postfix.append(" ");
            }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack= new Stack<>();   //操作数栈,链式栈
        double value=0;
        int j;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' ' && ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }

    public static String isMatched(String infix){
        Stack<String> stack= new Stack<>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            switch(ch){
                case'(':
                    stack.push(ch+"");
                    break;
                case')':
                    if(stack.isEmpty()||!stack.pop().equals("("))
                        return "expect   (";
            }
        }
        return(stack.isEmpty())?"no error":"expect   )";
    }
}





//package com.nopalyer.calculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//
//import org.mozilla.javascript.Context;
//import org.mozilla.javascript.Scriptable;
//
//public class MainActivity extends AppCompatActivity {
//
//
//    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
//            btnPercent,btnPlus,btnMinus,btnMultiply,btnDivision,
//            btnEqual,btnClear,btnDot,btnBracket;
//    TextView tvInput,tvOutput;
//    String process;//算子
//    boolean checkBracket = false;//括号检查
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        btn0 = findViewById(R.id.btn0);
//        btn1 = findViewById(R.id.btn1);
//        btn2 = findViewById(R.id.btn2);
//        btn3 = findViewById(R.id.btn3);
//        btn4 = findViewById(R.id.btn4);
//        btn5 = findViewById(R.id.btn5);
//        btn6 = findViewById(R.id.btn6);
//        btn7 = findViewById(R.id.btn7);
//        btn8 = findViewById(R.id.btn8);
//        btn9 = findViewById(R.id.btn9);
//
//        btnPlus = findViewById(R.id.btnPlus);
//        btnMinus = findViewById(R.id.btnMinus);
//        btnDivision = findViewById(R.id.btnDivision);
//        btnMultiply = findViewById(R.id.btnMultiply);
//
//        btnEqual = findViewById(R.id.btnEqual);
//
//        btnClear = findViewById(R.id.btnClear);
//        btnDot = findViewById(R.id.btnDot);
//        btnPercent = findViewById(R.id.btnPercent);
//        btnBracket = findViewById(R.id.btnBracket);
//
//        tvInput = findViewById(R.id.tvInput);
//        tvOutput = findViewById(R.id.tvOutput);
//
//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvInput.setText("");
//                tvOutput.setText("");
//            }
//        });
//
//
//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "0");
//            }
//        });
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "1");
//            }
//        });
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "2");
//            }
//        });
//
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "3");
//            }
//        });
//
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "4");
//            }
//        });
//
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "5");
//            }
//        });
//
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "6");
//            }
//        });
//
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "6");
//            }
//        });
//
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "7");
//            }
//        });
//
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "8");
//            }
//        });
//
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "9");
//            }
//        });
//
//        btnPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "+");
//            }
//        });
//
//
//        btnMinus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "-");
//            }
//        });
//
//        btnMultiply.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "×");
//            }
//        });
//
//        btnDivision.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "÷");
//            }
//        });
//
//        btnDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + ".");
//            }
//        });
//
//        btnPercent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//                tvInput.setText(process + "%");
//            }
//        });
//
//        btnBracket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (checkBracket){
//                    process = tvInput.getText().toString();
//                    tvInput.setText(process + ")");
//                    checkBracket = false;
//                }else{
//                    process = tvInput.getText().toString();
//                    tvInput.setText(process + "(");
//                    checkBracket = true;
//                }
//
//            }
//        });
//
//        btnEqual.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = tvInput.getText().toString();
//
//                process = process.replaceAll("×","*");
//                process = process.replaceAll("%","/100");
//                process = process.replaceAll("÷","/");
//
//
//                /**
//                 * 调用js在jvm运行，调用rhino引擎 api
//                 */
//                Context context = Context.enter();
//
//                context.setOptimizationLevel(-1);
//
//                String finalResult = "";
//
//                try {
//                    //js对象
//                    Scriptable scriptable = context.initStandardObjects();
//                    /**
//                     * (Scriptable scope域, String source引擎,
//                     * String sourceName, int lineno,
//                     * Object securityDomain
//                     */
//                    /**
//                     * @param source the source string
//                     * @param sourceName a string describing the source, such as a filename
//                     * @param lineno the starting line number for reporting errors. Use
//                     * 0 if the line number is unknown.
//                     * @param securityDomain an arbitrary object that specifies security
//                     * information about the origin or owner of the script. For
//                     * implementations that don't care about security, this value
//                     * may be null.
//                     */
//                    finalResult = context.evaluateString(scriptable,process,"javascript",1,null).toString();
//                }catch (Exception e){
//                    finalResult="0";
//                }
//
//                tvOutput.setText(finalResult);
//            }
//        });
//
//
//    }
//}
