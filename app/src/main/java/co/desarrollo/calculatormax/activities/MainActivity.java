package co.desarrollo.calculatormax.activities;

import androidx.appcompat.app.AppCompatActivity;
import co.desarrollo.calculatormax.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lblResultadoTexto, lblHistoricoOperacion;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnPor, btnDividido, btnIgual, btnLimpiar;
    private boolean bolResultadoCalculado;
    private String strOperacionAnterior = "";
    private String strHistoricoOperacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitUI();
        InitHandlers();
    }

    private void InitUI() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnPor = findViewById(R.id.btnPor);
        btnDividido = findViewById(R.id.btnDividido);
        btnIgual = findViewById(R.id.btnIgual);
        btnLimpiar = findViewById(R.id.btnLimpiar);

        lblResultadoTexto = findViewById(R.id.lblResultadoTexto);
        lblHistoricoOperacion = findViewById(R.id.lblHistoricoOperacion);
    }

    private void InitHandlers() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "0" : lblResultadoTexto.getText().toString() + "0");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "0" : strHistoricoOperacion + "0";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);

                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "0" : lblResultadoTexto.getText().toString() + "0");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "0" : strHistoricoOperacion + "0";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "1" : lblResultadoTexto.getText().toString() + "1");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "1" : strHistoricoOperacion + "1";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);

                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "1" : lblResultadoTexto.getText().toString() + "1");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "1" : strHistoricoOperacion + "1";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "2" : lblResultadoTexto.getText().toString() + "2");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "2" : strHistoricoOperacion + "2";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "2" : lblResultadoTexto.getText().toString() + "2");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "2" : strHistoricoOperacion + "2";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "3" : lblResultadoTexto.getText().toString() + "3");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "3" : strHistoricoOperacion + "3";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "3" : lblResultadoTexto.getText().toString() + "3");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "3" : strHistoricoOperacion + "3";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "4" : lblResultadoTexto.getText().toString() + "4");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "4" : strHistoricoOperacion + "4";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "4" : lblResultadoTexto.getText().toString() + "4");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "4" : strHistoricoOperacion + "4";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "5" : lblResultadoTexto.getText().toString() + "5");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "5" : strHistoricoOperacion + "5";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "5" : lblResultadoTexto.getText().toString() + "5");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "5" : strHistoricoOperacion + "5";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "6" : lblResultadoTexto.getText().toString() + "6");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "6" : strHistoricoOperacion + "6";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "6" : lblResultadoTexto.getText().toString() + "6");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "6" : strHistoricoOperacion + "6";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "7" : lblResultadoTexto.getText().toString() + "7");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "7" : strHistoricoOperacion + "7";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "7" : lblResultadoTexto.getText().toString() + "7");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "7" : strHistoricoOperacion + "7";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "8" : lblResultadoTexto.getText().toString() + "8");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "8" : strHistoricoOperacion + "8";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "8" : lblResultadoTexto.getText().toString() + "8");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "8" : strHistoricoOperacion + "8";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bolResultadoCalculado) {
                    btnLimpiar.callOnClick();
                    bolResultadoCalculado = false;
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "9" : lblResultadoTexto.getText().toString() + "9");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "9" : strHistoricoOperacion + "9";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                } else {
                    lblResultadoTexto.setText(lblResultadoTexto.getText().toString().equals("0") ? "9" : lblResultadoTexto.getText().toString() + "9");
                    strHistoricoOperacion = strHistoricoOperacion.equals("0") ? "9" : strHistoricoOperacion + "9";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                }
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!EvaluarUltimoCaracterNumero()) {
                    bolResultadoCalculado = false;
                    strHistoricoOperacion += " + ";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                    double dobResultado = eval(lblResultadoTexto.getText().toString());
                    String strResultado = dobResultado % 1 == 0 ? String.valueOf(dobResultado).replace(".0", "") : String.valueOf(dobResultado);
                    lblResultadoTexto.setText(getString(R.string.strOperacionMas, (strResultado.length() > 13 ? strResultado.substring(0, 13) : strResultado)));
                }
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!EvaluarUltimoCaracterNumero()) {
                    bolResultadoCalculado = false;
                    strHistoricoOperacion += " - ";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                    double dobResultado = eval(lblResultadoTexto.getText().toString());
                    String strResultado = dobResultado % 1 == 0 ? String.valueOf(dobResultado).replace(".0", "") : String.valueOf(dobResultado);
                    lblResultadoTexto.setText(getString(R.string.strOperacionMenos, (strResultado.length() > 13 ? strResultado.substring(0, 13) : strResultado)));
                }
            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!EvaluarUltimoCaracterNumero()) {
                    bolResultadoCalculado = false;
                    strHistoricoOperacion += " × ";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                    double dobResultado = eval(lblResultadoTexto.getText().toString());
                    String strResultado = dobResultado % 1 == 0 ? String.valueOf(dobResultado).replace(".0", "") : String.valueOf(dobResultado);
                    lblResultadoTexto.setText(getString(R.string.strOperacionPor, (strResultado.length() > 13 ? strResultado.substring(0, 13) : strResultado)));
                }
            }
        });

        btnDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!EvaluarUltimoCaracterNumero()) {
                    bolResultadoCalculado = false;
                    strHistoricoOperacion += " ÷ ";
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                    double dobResultado = eval(lblResultadoTexto.getText().toString());
                    String strResultado = dobResultado % 1 == 0 ? String.valueOf(dobResultado).replace(".0", "") : String.valueOf(dobResultado);
                    lblResultadoTexto.setText(getString(R.string.strOperacionDividido, (strResultado.length() > 13 ? strResultado.substring(0, 13) : strResultado)));
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dobResultado = eval(lblResultadoTexto.getText().toString());
                String strResultado = dobResultado % 1 == 0 ? String.valueOf(dobResultado).replace(".0", "") : String.valueOf(dobResultado);
                lblResultadoTexto.setText(strResultado);
                strHistoricoOperacion = strHistoricoOperacion.equals("") || strHistoricoOperacion.equals("0") ? "0" : strHistoricoOperacion;

                if (!strOperacionAnterior.equals(strHistoricoOperacion)) {
                    strHistoricoOperacion += " = " + strResultado;
                    strOperacionAnterior = strHistoricoOperacion;
                    lblHistoricoOperacion.setText(strHistoricoOperacion);
                    bolResultadoCalculado = true;
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblResultadoTexto.setText("0");
                lblHistoricoOperacion.setText("");
                strHistoricoOperacion = "";
                strOperacionAnterior = "";
                bolResultadoCalculado = false;
            }
        });
    }

    public double eval(final String str) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < str.length()) throw new RuntimeException("Error: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm();
                        else if (eat('-')) x -= parseTerm();
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('×')) x *= parseFactor(); // multiplicación
                        else if (eat('÷')) x /= parseFactor(); // división
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // más
                    if (eat('-')) return -parseFactor(); // menos

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // paréntesis
                        x = parseExpression();
                        eat(')');
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // números
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, this.pos));
                    } else if (ch >= 'a' && ch <= 'z') { // funciones
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = str.substring(startPos, this.pos);
                        x = parseFactor();

                        switch (func) {
                            case "sqrt":
                                x = Math.sqrt(x);
                                break;
                            case "sin":
                                x = Math.sin(Math.toRadians(x));
                                break;
                            case "cos":
                                x = Math.cos(Math.toRadians(x));
                                break;
                            case "tan":
                                x = Math.tan(Math.toRadians(x));
                                break;
                            default:
                                throw new RuntimeException("Función desconocida: " + func);
                        }
                    } else {
                        throw new RuntimeException("Error: " + (char) ch);
                    }

                    if (eat('^')) x = Math.pow(x, parseFactor()); // exponenciación

                    return x;
                }
            }.parse();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Operación inválida.", Toast.LENGTH_LONG).show();
            btnLimpiar.callOnClick();
            return 0;
        }
    }

    public boolean EvaluarUltimoCaracterNumero() {
        String strContenido = lblResultadoTexto.getText().toString();
        char chaUltimoCaracter = strContenido.charAt(strContenido.length() - 1);
        return chaUltimoCaracter != '0' && chaUltimoCaracter != '1' &&
                chaUltimoCaracter != '2' && chaUltimoCaracter != '3' &&
                chaUltimoCaracter != '4' && chaUltimoCaracter != '5' &&
                chaUltimoCaracter != '6' && chaUltimoCaracter != '7' &&
                chaUltimoCaracter != '8' && chaUltimoCaracter != '9';

    }
}