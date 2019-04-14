/*
 * The MIT License
 *
 * Copyright: Copyright (C) 2014 T2Ti.COM
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 * 
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package com.t2ti.sat.infra;

import com.sun.xml.internal.messaging.saaj.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class TratarRetornoSAT {

    public static Map retornoVenda(String retorno) throws Exception {
        Map map = new HashMap();

        String camposRetorno[] = new String[13];
        camposRetorno[0] = "numeroSessao";
        camposRetorno[1] = "codigoRetorno";
        camposRetorno[2] = "codigoAlerta";
        camposRetorno[3] = "mensagem";
        camposRetorno[4] = "codigoReferencia";
        camposRetorno[5] = "mensagemSefaz";
        camposRetorno[6] = "arquivoCFe";
        camposRetorno[7] = "timeStamp";
        camposRetorno[8] = "chaveConsulta";
        camposRetorno[9] = "valorTotalCFe";
        camposRetorno[10] = "cpfCnpj";
        camposRetorno[11] = "assinaturaQRCode";
        
        String resultado[] = retorno.split("\\|");
        
        for (int i = 0; i < resultado.length; i++) {
            if (i == 6) {
                map.put(camposRetorno[i], Base64.base64Decode(resultado[i].replace("\n", "")));
            } else {
                map.put(camposRetorno[i], resultado[i]);
            }
        }
        
        map.put("autorizado", map.get(camposRetorno[1]).equals("06000"));

        return map;
    }

    public static String retornoStatusOperacional(String retorno) throws Exception {
        String camposRetorno[] = retorno.split("\\|");
        //System.out.println(retorno);
        //EXERCiCIO: O campo ULTIMO_CFe não está sendo retornado pelo emulador.
        // Verificar se existe na documentação do SAT/Emulador se há alguma informação a respeito.
        
        String resultado = "";
        if (camposRetorno.length == 28) {
            resultado = "NSERIE.........: " + camposRetorno[5] + "\n"
                    +  "LAN_MAC........: " + camposRetorno[8] + "\n"
                    +  "STATUS_LAN.....: " + camposRetorno[13] + "\n"
                    +  "NIVEL_BATERIA..: " + camposRetorno[14] + "\n"
                    +  "MT_TOTAL.......: " + camposRetorno[15] + "\n"
                    +  "MT_USADA.......: " + camposRetorno[16] + "\n"
                    +  "DH_ATUAL.......: " + camposRetorno[17] + "\n"
                    +  "VER_SB.........: " + camposRetorno[18] + "\n"
                    +  "VER_LAYOUT.....: " + camposRetorno[19] + "\n"
                    +  "ULTIMO_CFe.....: " + camposRetorno[20] + "\n"
                    +  "LISTA_INICIAL..: " + camposRetorno[21] + "\n"
                    +  "LISTA_FINAL....: " + camposRetorno[22] + "\n"
                    +  "DH_CFe.........: " + camposRetorno[23] + "\n"
                    +  "DH_ULTIMA......: " + camposRetorno[24] + "\n"
                    +  "CERT_EMISSAO...: " + camposRetorno[25] + "\n"
                    +  "CERT_VENCIMENTO: " + camposRetorno[26] + "\n"
                    +  "ESTADO_OPERACAO: " + camposRetorno[27] + "\n"
                    +  "MSG SEFAZ......: " + camposRetorno[4];
        } else {
            resultado = "NSERIE.........: " + camposRetorno[5] + "\n"
                    +  "LAN_MAC........: " + camposRetorno[8] + "\n"
                    +  "STATUS_LAN.....: " + camposRetorno[13] + "\n"
                    +  "NIVEL_BATERIA..: " + camposRetorno[14] + "\n"
                    +  "MT_TOTAL.......: " + camposRetorno[15] + "\n"
                    +  "MT_USADA.......: " + camposRetorno[16] + "\n"
                    +  "DH_ATUAL.......: " + camposRetorno[17] + "\n"
                    +  "VER_SB.........: " + camposRetorno[18] + "\n"
                    +  "VER_LAYOUT.....: " + camposRetorno[19] + "\n"
                    +  "LISTA_INICIAL..: " + camposRetorno[20] + "\n"
                    +  "LISTA_FINAL....: " + camposRetorno[21] + "\n"
                    +  "DH_CFe.........: " + camposRetorno[22] + "\n"
                    +  "DH_ULTIMA......: " + camposRetorno[23] + "\n"
                    +  "CERT_EMISSAO...: " + camposRetorno[24] + "\n"
                    +  "CERT_VENCIMENTO: " + camposRetorno[25] + "\n"
                    +  "ESTADO_OPERACAO: " + camposRetorno[26] + "\n"
                    +  "MSG SEFAZ......: " + camposRetorno[4];
        }
        
        return resultado;
    }
    
}
