//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.01.15 às 01:45:32 PM BRST 
//


package br.gov.sp.fazenda.sat.cferecepcao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="^\d$"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idLote">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="^\d{1,15}$"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cUF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="^\d{2}$"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoteCFe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CFe" maxOccurs="50">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="infCFe">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ide">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cUF">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{2}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cNF">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{6}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="mod">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nserieSAT">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{9}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nCFe">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{6}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="dEmi">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{8}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="hEmi">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{6}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cDV">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="tpAmb">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="CNPJ">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{14}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="signAC">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="344"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="assinaturaQRCODE">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="344"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="numeroCaixa">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{3}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="emit">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CNPJ">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{14}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xNome">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xFant" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="enderEmit">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="xLgr">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="nro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="xCpl" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="xBairro">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="xMun">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="2"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="CEP">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{8}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="IE">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="12"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="IM" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cRegTrib">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="cRegTribISSQN" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{1}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="indRatISSQN">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="dest">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="CNPJ" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;pattern value="^\d{14}$"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="CPF" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;pattern value="^\d{0}$|^\d{11}$"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="xNome" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="2"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="entrega" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="xLgr">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="2"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="nro">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xCpl" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xBairro">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="xMun">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="2"/>
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="UF">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;length value="2"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="det" maxOccurs="500">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="prod">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cProd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cEAN" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="xProd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="120"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="NCM" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^.{2}$|^.{8}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="CFOP">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{4}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="uCom">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="6"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="qCom">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vUnCom">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vProd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="indRegra">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;length value="1"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vDesc" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vOutro" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vItem">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vRatDesc" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vRatAcr" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="xTextoDet">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;minLength value="1"/>
 *                                                                           &lt;maxLength value="60"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="xCampoDet" use="required">
 *                                                                     &lt;simpleType>
 *                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                         &lt;minLength value="1"/>
 *                                                                         &lt;maxLength value="20"/>
 *                                                                       &lt;/restriction>
 *                                                                     &lt;/simpleType>
 *                                                                   &lt;/attribute>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="imposto">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="vItem12741" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;choice>
 *                                                             &lt;element name="ICMS">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;choice>
 *                                                                       &lt;element name="ICMS00">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="Orig">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="CST">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="pICMS">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="vICMS">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="ICMS40">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="Orig">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="CST">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="ICMSSN102">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="Orig">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="CSOSN">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{3}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="ICMSSN900">
 *                                                                         &lt;complexType>
 *                                                                           &lt;complexContent>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                               &lt;sequence>
 *                                                                                 &lt;element name="Orig">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="CSOSN">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{3}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="pICMS">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                                 &lt;element name="vICMS">
 *                                                                                   &lt;simpleType>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/simpleType>
 *                                                                                 &lt;/element>
 *                                                                               &lt;/sequence>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/complexContent>
 *                                                                         &lt;/complexType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/choice>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="ISSQN">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="vDeducISSQN">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="vBC">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="vAliq">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="vISSQN">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="cMunFG" minOccurs="0">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{7}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="cListServ" minOccurs="0">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;length value="5"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="cServTribMun" minOccurs="0">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;length value="20"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="cNatOp">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d{2}$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="indIncFisc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;pattern value="^\d*[1-2]$"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/choice>
 *                                                           &lt;element name="PIS">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;choice>
 *                                                                     &lt;element name="PISAliq">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vBC">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="pPIS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1}\.\d{1,4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vPIS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="PISQtde">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="qBCProd">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vAliqProd">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vPIS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="PISNT">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="PISSN">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="PISOutr">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;choice>
 *                                                                                 &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                                   &lt;element name="vBC" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                   &lt;element name="pPIS" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                 &lt;/choice>
 *                                                                                 &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                                   &lt;element name="qBCProd" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                   &lt;element name="vAliqProd" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                 &lt;/choice>
 *                                                                               &lt;/choice>
 *                                                                               &lt;element name="vPIS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/choice>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PISST" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;choice>
 *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                         &lt;element name="vBC" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                         &lt;element name="pPIS" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                       &lt;/choice>
 *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                         &lt;element name="qBCProd" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                         &lt;element name="vAliqProd" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                       &lt;/choice>
 *                                                                     &lt;/choice>
 *                                                                     &lt;element name="vPIS">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="COFINS">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;choice>
 *                                                                     &lt;element name="COFINSAliq">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vBC">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="pCOFINS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vCOFINS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="COFINSQtde">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="qBCProd">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vAliqProd">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="vCOFINS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="COFINSNT">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="COFINSSN">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="COFINSOutr">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="CST">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                               &lt;choice>
 *                                                                                 &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                                   &lt;element name="vBC" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                   &lt;element name="pCOFINS" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                 &lt;/choice>
 *                                                                                 &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                                   &lt;element name="qBCProd" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                   &lt;element name="vAliqProd" minOccurs="0">
 *                                                                                     &lt;simpleType>
 *                                                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                         &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                                       &lt;/restriction>
 *                                                                                     &lt;/simpleType>
 *                                                                                   &lt;/element>
 *                                                                                 &lt;/choice>
 *                                                                               &lt;/choice>
 *                                                                               &lt;element name="vCOFINS">
 *                                                                                 &lt;simpleType>
 *                                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                                   &lt;/restriction>
 *                                                                                 &lt;/simpleType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/choice>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="COFINSST" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;choice>
 *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                         &lt;element name="vBC" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                         &lt;element name="pCOFINS" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                       &lt;/choice>
 *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
 *                                                                         &lt;element name="qBCProd" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                         &lt;element name="vAliqProd" minOccurs="0">
 *                                                                           &lt;simpleType>
 *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
 *                                                                             &lt;/restriction>
 *                                                                           &lt;/simpleType>
 *                                                                         &lt;/element>
 *                                                                       &lt;/choice>
 *                                                                     &lt;/choice>
 *                                                                     &lt;element name="vCOFINS">
 *                                                                       &lt;simpleType>
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                                         &lt;/restriction>
 *                                                                       &lt;/simpleType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="infAdProd" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="500"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="nItem" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;pattern value="^\d{1,3}$"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="total">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ICMSTot" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="vICMS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vProd">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vDesc">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vPIS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vCOFINS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vPISST">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vCOFINSST">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vOutro">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vCFe">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ISSQNtot" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="vBC">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vISS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vPIS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vCOFINS">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vPISST">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vCOFINSST">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DescAcrEntr" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element name="vDescSubtot" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vAcresSubtot" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vCFeLei12741" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="pgto">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="MP" maxOccurs="10">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cMP">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="vMP">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="cAdmC" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;pattern value="^\d{3}$"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vTroco">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="infAdic" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="infCpl" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="5000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="xTexto">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;minLength value="1"/>
 *                                                                 &lt;maxLength value="60"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="xCampo" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="20"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="versao" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="versaoDadosEnt" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="versaoSB" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="^\d{6}$"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Id" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="47"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#'/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nSeg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="344"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhEnvio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="^\d{14}$"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nserieSAT">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="^\d{9}$"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tpAmb",
    "idLote",
    "cuf",
    "loteCFe",
    "nSeg",
    "dhEnvio",
    "nserieSAT"
})
@XmlRootElement(name = "envCFe")
public class EnvCFe {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String idLote;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(name = "LoteCFe", required = true)
    protected EnvCFe.LoteCFe loteCFe;
    @XmlElement(required = true)
    protected String nSeg;
    @XmlElement(required = true)
    protected String dhEnvio;
    @XmlElement(required = true)
    protected String nserieSAT;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade idLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * Define o valor da propriedade idLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLote(String value) {
        this.idLote = value;
    }

    /**
     * Obtém o valor da propriedade cuf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Define o valor da propriedade cuf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Obtém o valor da propriedade loteCFe.
     * 
     * @return
     *     possible object is
     *     {@link EnvCFe.LoteCFe }
     *     
     */
    public EnvCFe.LoteCFe getLoteCFe() {
        return loteCFe;
    }

    /**
     * Define o valor da propriedade loteCFe.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvCFe.LoteCFe }
     *     
     */
    public void setLoteCFe(EnvCFe.LoteCFe value) {
        this.loteCFe = value;
    }

    /**
     * Obtém o valor da propriedade nSeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSeg() {
        return nSeg;
    }

    /**
     * Define o valor da propriedade nSeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSeg(String value) {
        this.nSeg = value;
    }

    /**
     * Obtém o valor da propriedade dhEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhEnvio() {
        return dhEnvio;
    }

    /**
     * Define o valor da propriedade dhEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhEnvio(String value) {
        this.dhEnvio = value;
    }

    /**
     * Obtém o valor da propriedade nserieSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNserieSAT() {
        return nserieSAT;
    }

    /**
     * Define o valor da propriedade nserieSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNserieSAT(String value) {
        this.nserieSAT = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CFe" maxOccurs="50">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="infCFe">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ide">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cUF">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{2}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cNF">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{6}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="mod">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nserieSAT">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{9}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nCFe">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{6}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="dEmi">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{8}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="hEmi">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{6}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cDV">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="tpAmb">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="CNPJ">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{14}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="signAC">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="344"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="assinaturaQRCODE">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="344"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="numeroCaixa">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{3}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="emit">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CNPJ">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{14}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="xNome">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="xFant" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="enderEmit">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="xLgr">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="nro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="xCpl" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="xBairro">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="xMun">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="2"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="CEP">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{8}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="IE">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="12"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="IM" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cRegTrib">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="cRegTribISSQN" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{1}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="indRatISSQN">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="1"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="dest">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="CNPJ" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;pattern value="^\d{14}$"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="CPF" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;pattern value="^\d{0}$|^\d{11}$"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;element name="xNome" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="2"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="entrega" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="xLgr">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="2"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="nro">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="xCpl" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="xBairro">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="xMun">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="2"/>
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="UF">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;length value="2"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="det" maxOccurs="500">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="prod">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cProd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cEAN" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="xProd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="120"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="NCM" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^.{2}$|^.{8}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="CFOP">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{4}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="uCom">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="6"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="qCom">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vUnCom">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vProd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="indRegra">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;length value="1"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vDesc" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vOutro" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vItem">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vRatDesc" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vRatAcr" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="xTextoDet">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;minLength value="1"/>
     *                                                                 &lt;maxLength value="60"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="xCampoDet" use="required">
     *                                                           &lt;simpleType>
     *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                               &lt;minLength value="1"/>
     *                                                               &lt;maxLength value="20"/>
     *                                                             &lt;/restriction>
     *                                                           &lt;/simpleType>
     *                                                         &lt;/attribute>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="imposto">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="vItem12741" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;choice>
     *                                                   &lt;element name="ICMS">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;choice>
     *                                                             &lt;element name="ICMS00">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="Orig">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="CST">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="pICMS">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="vICMS">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="ICMS40">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="Orig">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="CST">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="ICMSSN102">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="Orig">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="CSOSN">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{3}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="ICMSSN900">
     *                                                               &lt;complexType>
     *                                                                 &lt;complexContent>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                     &lt;sequence>
     *                                                                       &lt;element name="Orig">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="CSOSN">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{3}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="pICMS">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                       &lt;element name="vICMS">
     *                                                                         &lt;simpleType>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/simpleType>
     *                                                                       &lt;/element>
     *                                                                     &lt;/sequence>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/complexContent>
     *                                                               &lt;/complexType>
     *                                                             &lt;/element>
     *                                                           &lt;/choice>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="ISSQN">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="vDeducISSQN">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="vBC">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="vAliq">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="vISSQN">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="cMunFG" minOccurs="0">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{7}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="cListServ" minOccurs="0">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;length value="5"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="cServTribMun" minOccurs="0">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;length value="20"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="cNatOp">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d{2}$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="indIncFisc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;pattern value="^\d*[1-2]$"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                 &lt;/choice>
     *                                                 &lt;element name="PIS">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;choice>
     *                                                           &lt;element name="PISAliq">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vBC">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="pPIS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1}\.\d{1,4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vPIS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="PISQtde">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="qBCProd">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vAliqProd">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vPIS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="PISNT">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="PISSN">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="PISOutr">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;choice>
     *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
     *                                                                         &lt;element name="vBC" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                         &lt;element name="pPIS" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                       &lt;/choice>
     *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
     *                                                                         &lt;element name="qBCProd" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                         &lt;element name="vAliqProd" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                       &lt;/choice>
     *                                                                     &lt;/choice>
     *                                                                     &lt;element name="vPIS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/choice>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PISST" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;choice>
     *                                                             &lt;choice maxOccurs="2" minOccurs="2">
     *                                                               &lt;element name="vBC" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                               &lt;element name="pPIS" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                             &lt;/choice>
     *                                                             &lt;choice maxOccurs="2" minOccurs="2">
     *                                                               &lt;element name="qBCProd" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                               &lt;element name="vAliqProd" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                             &lt;/choice>
     *                                                           &lt;/choice>
     *                                                           &lt;element name="vPIS">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="COFINS">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;choice>
     *                                                           &lt;element name="COFINSAliq">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vBC">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="pCOFINS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vCOFINS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="COFINSQtde">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="qBCProd">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vAliqProd">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="vCOFINS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="COFINSNT">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="COFINSSN">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="COFINSOutr">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="CST">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                     &lt;choice>
     *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
     *                                                                         &lt;element name="vBC" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                         &lt;element name="pCOFINS" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                       &lt;/choice>
     *                                                                       &lt;choice maxOccurs="2" minOccurs="2">
     *                                                                         &lt;element name="qBCProd" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                         &lt;element name="vAliqProd" minOccurs="0">
     *                                                                           &lt;simpleType>
     *                                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                             &lt;/restriction>
     *                                                                           &lt;/simpleType>
     *                                                                         &lt;/element>
     *                                                                       &lt;/choice>
     *                                                                     &lt;/choice>
     *                                                                     &lt;element name="vCOFINS">
     *                                                                       &lt;simpleType>
     *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                         &lt;/restriction>
     *                                                                       &lt;/simpleType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/choice>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="COFINSST" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;choice>
     *                                                             &lt;choice maxOccurs="2" minOccurs="2">
     *                                                               &lt;element name="vBC" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                               &lt;element name="pCOFINS" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                             &lt;/choice>
     *                                                             &lt;choice maxOccurs="2" minOccurs="2">
     *                                                               &lt;element name="qBCProd" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                               &lt;element name="vAliqProd" minOccurs="0">
     *                                                                 &lt;simpleType>
     *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
     *                                                                   &lt;/restriction>
     *                                                                 &lt;/simpleType>
     *                                                               &lt;/element>
     *                                                             &lt;/choice>
     *                                                           &lt;/choice>
     *                                                           &lt;element name="vCOFINS">
     *                                                             &lt;simpleType>
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                               &lt;/restriction>
     *                                                             &lt;/simpleType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="infAdProd" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="500"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="nItem" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;pattern value="^\d{1,3}$"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="total">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ICMSTot" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="vICMS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vProd">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vDesc">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vPIS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vCOFINS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vPISST">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vCOFINSST">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vOutro">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="vCFe">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ISSQNtot" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="vBC">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vISS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vPIS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vCOFINS">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vPISST">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vCOFINSST">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DescAcrEntr" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element name="vDescSubtot" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vAcresSubtot" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/choice>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="vCFeLei12741" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="pgto">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="MP" maxOccurs="10">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cMP">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="vMP">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="cAdmC" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;pattern value="^\d{3}$"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="vTroco">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="infAdic" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="infCpl" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="5000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="xTexto">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;minLength value="1"/>
     *                                                       &lt;maxLength value="60"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="xCampo" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="20"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="versao" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="versaoDadosEnt" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="versaoSB" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="^\d{6}$"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Id" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="47"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#'/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cFe"
    })
    public static class LoteCFe {

        @XmlElement(name = "CFe", required = true)
        protected List<EnvCFe.LoteCFe.CFe> cFe;

        /**
         * Gets the value of the cFe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cFe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCFe().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnvCFe.LoteCFe.CFe }
         * 
         * 
         */
        public List<EnvCFe.LoteCFe.CFe> getCFe() {
            if (cFe == null) {
                cFe = new ArrayList<EnvCFe.LoteCFe.CFe>();
            }
            return this.cFe;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="infCFe">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ide">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cUF">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{2}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cNF">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{6}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="mod">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nserieSAT">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{9}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nCFe">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{6}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dEmi">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{8}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="hEmi">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{6}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cDV">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tpAmb">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="CNPJ">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{14}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="signAC">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="344"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="assinaturaQRCODE">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="344"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="numeroCaixa">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{3}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="emit">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CNPJ">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{14}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="xNome">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="xFant" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="enderEmit">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="xLgr">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="nro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="xCpl" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="xBairro">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="xMun">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="2"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="CEP">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{8}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="IE">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="12"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="IM" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cRegTrib">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="cRegTribISSQN" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{1}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="indRatISSQN">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dest">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="CNPJ" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;pattern value="^\d{14}$"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="CPF" minOccurs="0">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;pattern value="^\d{0}$|^\d{11}$"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;element name="xNome" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="2"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="entrega" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="xLgr">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="2"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="nro">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="xCpl" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="xBairro">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="xMun">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="2"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="UF">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;length value="2"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="det" maxOccurs="500">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="prod">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cProd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cEAN" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="xProd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="120"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="NCM" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^.{2}$|^.{8}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="CFOP">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{4}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="uCom">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="6"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="qCom">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vUnCom">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vProd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="indRegra">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;length value="1"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vDesc" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vOutro" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vItem">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vRatDesc" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vRatAcr" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="xTextoDet">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="60"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="xCampoDet" use="required">
         *                                                 &lt;simpleType>
         *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                     &lt;minLength value="1"/>
         *                                                     &lt;maxLength value="20"/>
         *                                                   &lt;/restriction>
         *                                                 &lt;/simpleType>
         *                                               &lt;/attribute>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="imposto">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="vItem12741" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;choice>
         *                                         &lt;element name="ICMS">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;choice>
         *                                                   &lt;element name="ICMS00">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="Orig">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="CST">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="pICMS">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="vICMS">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="ICMS40">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="Orig">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="CST">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="ICMSSN102">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="Orig">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="CSOSN">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{3}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="ICMSSN900">
         *                                                     &lt;complexType>
         *                                                       &lt;complexContent>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                           &lt;sequence>
         *                                                             &lt;element name="Orig">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="CSOSN">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{3}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="pICMS">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                             &lt;element name="vICMS">
         *                                                               &lt;simpleType>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/simpleType>
         *                                                             &lt;/element>
         *                                                           &lt;/sequence>
         *                                                         &lt;/restriction>
         *                                                       &lt;/complexContent>
         *                                                     &lt;/complexType>
         *                                                   &lt;/element>
         *                                                 &lt;/choice>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                         &lt;element name="ISSQN">
         *                                           &lt;complexType>
         *                                             &lt;complexContent>
         *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                 &lt;sequence>
         *                                                   &lt;element name="vDeducISSQN">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="vBC">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="vAliq">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="vISSQN">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="cMunFG" minOccurs="0">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{7}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="cListServ" minOccurs="0">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;length value="5"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="cServTribMun" minOccurs="0">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;length value="20"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="cNatOp">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d{2}$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                   &lt;element name="indIncFisc">
         *                                                     &lt;simpleType>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                         &lt;pattern value="^\d*[1-2]$"/>
         *                                                       &lt;/restriction>
         *                                                     &lt;/simpleType>
         *                                                   &lt;/element>
         *                                                 &lt;/sequence>
         *                                               &lt;/restriction>
         *                                             &lt;/complexContent>
         *                                           &lt;/complexType>
         *                                         &lt;/element>
         *                                       &lt;/choice>
         *                                       &lt;element name="PIS">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;choice>
         *                                                 &lt;element name="PISAliq">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vBC">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="pPIS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1}\.\d{1,4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vPIS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="PISQtde">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="qBCProd">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vAliqProd">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vPIS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="PISNT">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="PISSN">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="PISOutr">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;choice>
         *                                                             &lt;choice maxOccurs="2" minOccurs="2">
         *                                                               &lt;element name="vBC" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                               &lt;element name="pPIS" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                             &lt;/choice>
         *                                                             &lt;choice maxOccurs="2" minOccurs="2">
         *                                                               &lt;element name="qBCProd" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                               &lt;element name="vAliqProd" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                             &lt;/choice>
         *                                                           &lt;/choice>
         *                                                           &lt;element name="vPIS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/choice>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PISST" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;choice>
         *                                                   &lt;choice maxOccurs="2" minOccurs="2">
         *                                                     &lt;element name="vBC" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                     &lt;element name="pPIS" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                   &lt;/choice>
         *                                                   &lt;choice maxOccurs="2" minOccurs="2">
         *                                                     &lt;element name="qBCProd" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                     &lt;element name="vAliqProd" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                   &lt;/choice>
         *                                                 &lt;/choice>
         *                                                 &lt;element name="vPIS">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="COFINS">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;choice>
         *                                                 &lt;element name="COFINSAliq">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vBC">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="pCOFINS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vCOFINS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="COFINSQtde">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="qBCProd">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vAliqProd">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="vCOFINS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="COFINSNT">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="COFINSSN">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="COFINSOutr">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="CST">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                           &lt;choice>
         *                                                             &lt;choice maxOccurs="2" minOccurs="2">
         *                                                               &lt;element name="vBC" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                               &lt;element name="pCOFINS" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                             &lt;/choice>
         *                                                             &lt;choice maxOccurs="2" minOccurs="2">
         *                                                               &lt;element name="qBCProd" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                               &lt;element name="vAliqProd" minOccurs="0">
         *                                                                 &lt;simpleType>
         *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                     &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                                   &lt;/restriction>
         *                                                                 &lt;/simpleType>
         *                                                               &lt;/element>
         *                                                             &lt;/choice>
         *                                                           &lt;/choice>
         *                                                           &lt;element name="vCOFINS">
         *                                                             &lt;simpleType>
         *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                               &lt;/restriction>
         *                                                             &lt;/simpleType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/choice>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="COFINSST" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;choice>
         *                                                   &lt;choice maxOccurs="2" minOccurs="2">
         *                                                     &lt;element name="vBC" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                     &lt;element name="pCOFINS" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                   &lt;/choice>
         *                                                   &lt;choice maxOccurs="2" minOccurs="2">
         *                                                     &lt;element name="qBCProd" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                     &lt;element name="vAliqProd" minOccurs="0">
         *                                                       &lt;simpleType>
         *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
         *                                                         &lt;/restriction>
         *                                                       &lt;/simpleType>
         *                                                     &lt;/element>
         *                                                   &lt;/choice>
         *                                                 &lt;/choice>
         *                                                 &lt;element name="vCOFINS">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="infAdProd" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="500"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="nItem" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;pattern value="^\d{1,3}$"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="total">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ICMSTot" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="vICMS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vProd">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vDesc">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vPIS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vCOFINS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vPISST">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vCOFINSST">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vOutro">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="vCFe">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ISSQNtot" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="vBC">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vISS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vPIS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vCOFINS">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vPISST">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vCOFINSST">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DescAcrEntr" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="vDescSubtot" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vAcresSubtot" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="vCFeLei12741" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="pgto">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="MP" maxOccurs="10">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cMP">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="vMP">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="cAdmC" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;pattern value="^\d{3}$"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="vTroco">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="infAdic" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="infCpl" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="5000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="xTexto">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;minLength value="1"/>
         *                                             &lt;maxLength value="60"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="xCampo" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="20"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="versao" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="versaoDadosEnt" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="versaoSB" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="^\d{6}$"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Id" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="47"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;any processContents='lax' namespace='http://www.w3.org/2000/09/xmldsig#'/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "infCFe",
            "any"
        })
        public static class CFe {

            @XmlElement(required = true)
            protected EnvCFe.LoteCFe.CFe.InfCFe infCFe;
            @XmlAnyElement(lax = true)
            protected Object any;

            /**
             * Obtém o valor da propriedade infCFe.
             * 
             * @return
             *     possible object is
             *     {@link EnvCFe.LoteCFe.CFe.InfCFe }
             *     
             */
            public EnvCFe.LoteCFe.CFe.InfCFe getInfCFe() {
                return infCFe;
            }

            /**
             * Define o valor da propriedade infCFe.
             * 
             * @param value
             *     allowed object is
             *     {@link EnvCFe.LoteCFe.CFe.InfCFe }
             *     
             */
            public void setInfCFe(EnvCFe.LoteCFe.CFe.InfCFe value) {
                this.infCFe = value;
            }

            /**
             * Obtém o valor da propriedade any.
             * 
             * @return
             *     possible object is
             *     {@link Element }
             *     {@link Object }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * Define o valor da propriedade any.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     {@link Object }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ide">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cUF">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{2}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cNF">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{6}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="mod">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nserieSAT">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{9}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nCFe">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{6}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dEmi">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{8}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="hEmi">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{6}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cDV">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="tpAmb">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="CNPJ">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{14}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="signAC">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="344"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="assinaturaQRCODE">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="344"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="numeroCaixa">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{3}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="emit">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CNPJ">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{14}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="xNome">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="xFant" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="enderEmit">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="xLgr">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="nro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="xCpl" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="xBairro">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="xMun">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="2"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="CEP">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{8}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="IE">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="12"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="IM" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cRegTrib">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="cRegTribISSQN" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{1}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="indRatISSQN">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dest">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="CNPJ" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;pattern value="^\d{14}$"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="CPF" minOccurs="0">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;pattern value="^\d{0}$|^\d{11}$"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/choice>
             *                   &lt;element name="xNome" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="2"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="entrega" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="xLgr">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="2"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="nro">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="xCpl" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="xBairro">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="xMun">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="2"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="UF">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;length value="2"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="det" maxOccurs="500">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="prod">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cProd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cEAN" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="xProd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="120"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="NCM" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^.{2}$|^.{8}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="CFOP">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{4}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="uCom">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="6"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="qCom">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vUnCom">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vProd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="indRegra">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;length value="1"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vDesc" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vOutro" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vItem">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vRatDesc" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vRatAcr" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="xTextoDet">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="60"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="xCampoDet" use="required">
             *                                       &lt;simpleType>
             *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                           &lt;minLength value="1"/>
             *                                           &lt;maxLength value="20"/>
             *                                         &lt;/restriction>
             *                                       &lt;/simpleType>
             *                                     &lt;/attribute>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="imposto">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="vItem12741" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;choice>
             *                               &lt;element name="ICMS">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;choice>
             *                                         &lt;element name="ICMS00">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="Orig">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="CST">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="pICMS">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="vICMS">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                         &lt;element name="ICMS40">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="Orig">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="CST">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                         &lt;element name="ICMSSN102">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="Orig">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="CSOSN">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{3}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                         &lt;element name="ICMSSN900">
             *                                           &lt;complexType>
             *                                             &lt;complexContent>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                 &lt;sequence>
             *                                                   &lt;element name="Orig">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="CSOSN">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{3}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="pICMS">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                   &lt;element name="vICMS">
             *                                                     &lt;simpleType>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                       &lt;/restriction>
             *                                                     &lt;/simpleType>
             *                                                   &lt;/element>
             *                                                 &lt;/sequence>
             *                                               &lt;/restriction>
             *                                             &lt;/complexContent>
             *                                           &lt;/complexType>
             *                                         &lt;/element>
             *                                       &lt;/choice>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                               &lt;element name="ISSQN">
             *                                 &lt;complexType>
             *                                   &lt;complexContent>
             *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                       &lt;sequence>
             *                                         &lt;element name="vDeducISSQN">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="vBC">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="vAliq">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="vISSQN">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="cMunFG" minOccurs="0">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{7}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="cListServ" minOccurs="0">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;length value="5"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="cServTribMun" minOccurs="0">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;length value="20"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="cNatOp">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d{2}$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                         &lt;element name="indIncFisc">
             *                                           &lt;simpleType>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                               &lt;pattern value="^\d*[1-2]$"/>
             *                                             &lt;/restriction>
             *                                           &lt;/simpleType>
             *                                         &lt;/element>
             *                                       &lt;/sequence>
             *                                     &lt;/restriction>
             *                                   &lt;/complexContent>
             *                                 &lt;/complexType>
             *                               &lt;/element>
             *                             &lt;/choice>
             *                             &lt;element name="PIS">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;choice>
             *                                       &lt;element name="PISAliq">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vBC">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="pPIS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1}\.\d{1,4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vPIS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="PISQtde">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="qBCProd">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vAliqProd">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vPIS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="PISNT">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="PISSN">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="PISOutr">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;choice>
             *                                                   &lt;choice maxOccurs="2" minOccurs="2">
             *                                                     &lt;element name="vBC" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                     &lt;element name="pPIS" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                   &lt;/choice>
             *                                                   &lt;choice maxOccurs="2" minOccurs="2">
             *                                                     &lt;element name="qBCProd" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                     &lt;element name="vAliqProd" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                   &lt;/choice>
             *                                                 &lt;/choice>
             *                                                 &lt;element name="vPIS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/choice>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PISST" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;choice>
             *                                         &lt;choice maxOccurs="2" minOccurs="2">
             *                                           &lt;element name="vBC" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                           &lt;element name="pPIS" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                         &lt;/choice>
             *                                         &lt;choice maxOccurs="2" minOccurs="2">
             *                                           &lt;element name="qBCProd" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                           &lt;element name="vAliqProd" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                         &lt;/choice>
             *                                       &lt;/choice>
             *                                       &lt;element name="vPIS">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="COFINS">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;choice>
             *                                       &lt;element name="COFINSAliq">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vBC">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="pCOFINS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vCOFINS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="COFINSQtde">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="qBCProd">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vAliqProd">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="vCOFINS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="COFINSNT">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="COFINSSN">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="COFINSOutr">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="CST">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                                 &lt;choice>
             *                                                   &lt;choice maxOccurs="2" minOccurs="2">
             *                                                     &lt;element name="vBC" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                     &lt;element name="pCOFINS" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                   &lt;/choice>
             *                                                   &lt;choice maxOccurs="2" minOccurs="2">
             *                                                     &lt;element name="qBCProd" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                     &lt;element name="vAliqProd" minOccurs="0">
             *                                                       &lt;simpleType>
             *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                           &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                                         &lt;/restriction>
             *                                                       &lt;/simpleType>
             *                                                     &lt;/element>
             *                                                   &lt;/choice>
             *                                                 &lt;/choice>
             *                                                 &lt;element name="vCOFINS">
             *                                                   &lt;simpleType>
             *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                                     &lt;/restriction>
             *                                                   &lt;/simpleType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/choice>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="COFINSST" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;choice>
             *                                         &lt;choice maxOccurs="2" minOccurs="2">
             *                                           &lt;element name="vBC" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                           &lt;element name="pCOFINS" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                         &lt;/choice>
             *                                         &lt;choice maxOccurs="2" minOccurs="2">
             *                                           &lt;element name="qBCProd" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                           &lt;element name="vAliqProd" minOccurs="0">
             *                                             &lt;simpleType>
             *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
             *                                               &lt;/restriction>
             *                                             &lt;/simpleType>
             *                                           &lt;/element>
             *                                         &lt;/choice>
             *                                       &lt;/choice>
             *                                       &lt;element name="vCOFINS">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="infAdProd" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="500"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="nItem" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;pattern value="^\d{1,3}$"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="total">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ICMSTot" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="vICMS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vProd">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vDesc">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vPIS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vCOFINS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vPISST">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vCOFINSST">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vOutro">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="vCFe">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ISSQNtot" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="vBC">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vISS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vPIS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vCOFINS">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vPISST">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vCOFINSST">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DescAcrEntr" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="vDescSubtot" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vAcresSubtot" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="vCFeLei12741" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="pgto">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="MP" maxOccurs="10">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cMP">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="vMP">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="cAdmC" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;pattern value="^\d{3}$"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="vTroco">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="infAdic" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="infCpl" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="5000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="xTexto">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;minLength value="1"/>
             *                                   &lt;maxLength value="60"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="xCampo" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="20"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="versao" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="versaoDadosEnt" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="^\d{1,2}[.]{1}[0-9]{2}$"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="versaoSB" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="^\d{6}$"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Id" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="47"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ide",
                "emit",
                "dest",
                "entrega",
                "det",
                "total",
                "pgto",
                "infAdic"
            })
            public static class InfCFe {

                @XmlElement(required = true)
                protected EnvCFe.LoteCFe.CFe.InfCFe.Ide ide;
                @XmlElement(required = true)
                protected EnvCFe.LoteCFe.CFe.InfCFe.Emit emit;
                @XmlElement(required = true)
                protected EnvCFe.LoteCFe.CFe.InfCFe.Dest dest;
                protected EnvCFe.LoteCFe.CFe.InfCFe.Entrega entrega;
                @XmlElement(required = true)
                protected List<EnvCFe.LoteCFe.CFe.InfCFe.Det> det;
                @XmlElement(required = true)
                protected EnvCFe.LoteCFe.CFe.InfCFe.Total total;
                @XmlElement(required = true)
                protected EnvCFe.LoteCFe.CFe.InfCFe.Pgto pgto;
                protected EnvCFe.LoteCFe.CFe.InfCFe.InfAdic infAdic;
                @XmlAttribute(name = "versao", required = true)
                protected String versao;
                @XmlAttribute(name = "versaoDadosEnt", required = true)
                protected String versaoDadosEnt;
                @XmlAttribute(name = "versaoSB", required = true)
                protected String versaoSB;
                @XmlAttribute(name = "Id", required = true)
                protected String id;

                /**
                 * Obtém o valor da propriedade ide.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Ide }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Ide getIde() {
                    return ide;
                }

                /**
                 * Define o valor da propriedade ide.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Ide }
                 *     
                 */
                public void setIde(EnvCFe.LoteCFe.CFe.InfCFe.Ide value) {
                    this.ide = value;
                }

                /**
                 * Obtém o valor da propriedade emit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Emit }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Emit getEmit() {
                    return emit;
                }

                /**
                 * Define o valor da propriedade emit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Emit }
                 *     
                 */
                public void setEmit(EnvCFe.LoteCFe.CFe.InfCFe.Emit value) {
                    this.emit = value;
                }

                /**
                 * Obtém o valor da propriedade dest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Dest }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Dest getDest() {
                    return dest;
                }

                /**
                 * Define o valor da propriedade dest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Dest }
                 *     
                 */
                public void setDest(EnvCFe.LoteCFe.CFe.InfCFe.Dest value) {
                    this.dest = value;
                }

                /**
                 * Obtém o valor da propriedade entrega.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Entrega }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Entrega getEntrega() {
                    return entrega;
                }

                /**
                 * Define o valor da propriedade entrega.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Entrega }
                 *     
                 */
                public void setEntrega(EnvCFe.LoteCFe.CFe.InfCFe.Entrega value) {
                    this.entrega = value;
                }

                /**
                 * Gets the value of the det property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the det property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDet().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EnvCFe.LoteCFe.CFe.InfCFe.Det }
                 * 
                 * 
                 */
                public List<EnvCFe.LoteCFe.CFe.InfCFe.Det> getDet() {
                    if (det == null) {
                        det = new ArrayList<EnvCFe.LoteCFe.CFe.InfCFe.Det>();
                    }
                    return this.det;
                }

                /**
                 * Obtém o valor da propriedade total.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Total getTotal() {
                    return total;
                }

                /**
                 * Define o valor da propriedade total.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total }
                 *     
                 */
                public void setTotal(EnvCFe.LoteCFe.CFe.InfCFe.Total value) {
                    this.total = value;
                }

                /**
                 * Obtém o valor da propriedade pgto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Pgto }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.Pgto getPgto() {
                    return pgto;
                }

                /**
                 * Define o valor da propriedade pgto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Pgto }
                 *     
                 */
                public void setPgto(EnvCFe.LoteCFe.CFe.InfCFe.Pgto value) {
                    this.pgto = value;
                }

                /**
                 * Obtém o valor da propriedade infAdic.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.InfAdic }
                 *     
                 */
                public EnvCFe.LoteCFe.CFe.InfCFe.InfAdic getInfAdic() {
                    return infAdic;
                }

                /**
                 * Define o valor da propriedade infAdic.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EnvCFe.LoteCFe.CFe.InfCFe.InfAdic }
                 *     
                 */
                public void setInfAdic(EnvCFe.LoteCFe.CFe.InfCFe.InfAdic value) {
                    this.infAdic = value;
                }

                /**
                 * Obtém o valor da propriedade versao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersao() {
                    return versao;
                }

                /**
                 * Define o valor da propriedade versao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersao(String value) {
                    this.versao = value;
                }

                /**
                 * Obtém o valor da propriedade versaoDadosEnt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersaoDadosEnt() {
                    return versaoDadosEnt;
                }

                /**
                 * Define o valor da propriedade versaoDadosEnt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersaoDadosEnt(String value) {
                    this.versaoDadosEnt = value;
                }

                /**
                 * Obtém o valor da propriedade versaoSB.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersaoSB() {
                    return versaoSB;
                }

                /**
                 * Define o valor da propriedade versaoSB.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersaoSB(String value) {
                    this.versaoSB = value;
                }

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;choice>
                 *           &lt;element name="CNPJ" minOccurs="0">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                 &lt;pattern value="^\d{14}$"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="CPF" minOccurs="0">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                 &lt;pattern value="^\d{0}$|^\d{11}$"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *         &lt;/choice>
                 *         &lt;element name="xNome" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cnpj",
                    "cpf",
                    "xNome"
                })
                public static class Dest {

                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    @XmlElement(name = "CPF")
                    protected String cpf;
                    protected String xNome;

                    /**
                     * Obtém o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obtém o valor da propriedade cpf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCPF() {
                        return cpf;
                    }

                    /**
                     * Define o valor da propriedade cpf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCPF(String value) {
                        this.cpf = value;
                    }

                    /**
                     * Obtém o valor da propriedade xNome.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXNome() {
                        return xNome;
                    }

                    /**
                     * Define o valor da propriedade xNome.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXNome(String value) {
                        this.xNome = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="prod">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cProd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cEAN" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="xProd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="120"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="NCM" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^.{2}$|^.{8}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="CFOP">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{4}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="uCom">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="6"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="qCom">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vUnCom">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vProd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="indRegra">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;length value="1"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vDesc" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vOutro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vItem">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vRatDesc" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vRatAcr" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="xTextoDet">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="60"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="xCampoDet" use="required">
                 *                             &lt;simpleType>
                 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                 &lt;minLength value="1"/>
                 *                                 &lt;maxLength value="20"/>
                 *                               &lt;/restriction>
                 *                             &lt;/simpleType>
                 *                           &lt;/attribute>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="imposto">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="vItem12741" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;choice>
                 *                     &lt;element name="ICMS">
                 *                       &lt;complexType>
                 *                         &lt;complexContent>
                 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                             &lt;choice>
                 *                               &lt;element name="ICMS00">
                 *                                 &lt;complexType>
                 *                                   &lt;complexContent>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                       &lt;sequence>
                 *                                         &lt;element name="Orig">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="CST">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="pICMS">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="vICMS">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                       &lt;/sequence>
                 *                                     &lt;/restriction>
                 *                                   &lt;/complexContent>
                 *                                 &lt;/complexType>
                 *                               &lt;/element>
                 *                               &lt;element name="ICMS40">
                 *                                 &lt;complexType>
                 *                                   &lt;complexContent>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                       &lt;sequence>
                 *                                         &lt;element name="Orig">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="CST">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                       &lt;/sequence>
                 *                                     &lt;/restriction>
                 *                                   &lt;/complexContent>
                 *                                 &lt;/complexType>
                 *                               &lt;/element>
                 *                               &lt;element name="ICMSSN102">
                 *                                 &lt;complexType>
                 *                                   &lt;complexContent>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                       &lt;sequence>
                 *                                         &lt;element name="Orig">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="CSOSN">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{3}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                       &lt;/sequence>
                 *                                     &lt;/restriction>
                 *                                   &lt;/complexContent>
                 *                                 &lt;/complexType>
                 *                               &lt;/element>
                 *                               &lt;element name="ICMSSN900">
                 *                                 &lt;complexType>
                 *                                   &lt;complexContent>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                       &lt;sequence>
                 *                                         &lt;element name="Orig">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="CSOSN">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{3}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="pICMS">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                         &lt;element name="vICMS">
                 *                                           &lt;simpleType>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                             &lt;/restriction>
                 *                                           &lt;/simpleType>
                 *                                         &lt;/element>
                 *                                       &lt;/sequence>
                 *                                     &lt;/restriction>
                 *                                   &lt;/complexContent>
                 *                                 &lt;/complexType>
                 *                               &lt;/element>
                 *                             &lt;/choice>
                 *                           &lt;/restriction>
                 *                         &lt;/complexContent>
                 *                       &lt;/complexType>
                 *                     &lt;/element>
                 *                     &lt;element name="ISSQN">
                 *                       &lt;complexType>
                 *                         &lt;complexContent>
                 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                             &lt;sequence>
                 *                               &lt;element name="vDeducISSQN">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="vBC">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="vAliq">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="vISSQN">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="cMunFG" minOccurs="0">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{7}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="cListServ" minOccurs="0">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;length value="5"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="cServTribMun" minOccurs="0">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;length value="20"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="cNatOp">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d{2}$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                               &lt;element name="indIncFisc">
                 *                                 &lt;simpleType>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                     &lt;pattern value="^\d*[1-2]$"/>
                 *                                   &lt;/restriction>
                 *                                 &lt;/simpleType>
                 *                               &lt;/element>
                 *                             &lt;/sequence>
                 *                           &lt;/restriction>
                 *                         &lt;/complexContent>
                 *                       &lt;/complexType>
                 *                     &lt;/element>
                 *                   &lt;/choice>
                 *                   &lt;element name="PIS">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;choice>
                 *                             &lt;element name="PISAliq">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vBC">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="pPIS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1}\.\d{1,4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vPIS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="PISQtde">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="qBCProd">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vAliqProd">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vPIS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="PISNT">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="PISSN">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="PISOutr">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;choice>
                 *                                         &lt;choice maxOccurs="2" minOccurs="2">
                 *                                           &lt;element name="vBC" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                           &lt;element name="pPIS" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                         &lt;/choice>
                 *                                         &lt;choice maxOccurs="2" minOccurs="2">
                 *                                           &lt;element name="qBCProd" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                           &lt;element name="vAliqProd" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                         &lt;/choice>
                 *                                       &lt;/choice>
                 *                                       &lt;element name="vPIS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/choice>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PISST" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;choice>
                 *                               &lt;choice maxOccurs="2" minOccurs="2">
                 *                                 &lt;element name="vBC" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                                 &lt;element name="pPIS" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                               &lt;/choice>
                 *                               &lt;choice maxOccurs="2" minOccurs="2">
                 *                                 &lt;element name="qBCProd" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                                 &lt;element name="vAliqProd" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                               &lt;/choice>
                 *                             &lt;/choice>
                 *                             &lt;element name="vPIS">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="COFINS">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;choice>
                 *                             &lt;element name="COFINSAliq">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vBC">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="pCOFINS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vCOFINS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="COFINSQtde">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="qBCProd">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vAliqProd">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="vCOFINS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="COFINSNT">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="COFINSSN">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="COFINSOutr">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="CST">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                       &lt;choice>
                 *                                         &lt;choice maxOccurs="2" minOccurs="2">
                 *                                           &lt;element name="vBC" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                           &lt;element name="pCOFINS" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                         &lt;/choice>
                 *                                         &lt;choice maxOccurs="2" minOccurs="2">
                 *                                           &lt;element name="qBCProd" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                           &lt;element name="vAliqProd" minOccurs="0">
                 *                                             &lt;simpleType>
                 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                                 &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                               &lt;/restriction>
                 *                                             &lt;/simpleType>
                 *                                           &lt;/element>
                 *                                         &lt;/choice>
                 *                                       &lt;/choice>
                 *                                       &lt;element name="vCOFINS">
                 *                                         &lt;simpleType>
                 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                           &lt;/restriction>
                 *                                         &lt;/simpleType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/choice>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="COFINSST" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;choice>
                 *                               &lt;choice maxOccurs="2" minOccurs="2">
                 *                                 &lt;element name="vBC" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                                 &lt;element name="pCOFINS" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                               &lt;/choice>
                 *                               &lt;choice maxOccurs="2" minOccurs="2">
                 *                                 &lt;element name="qBCProd" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                                 &lt;element name="vAliqProd" minOccurs="0">
                 *                                   &lt;simpleType>
                 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                 *                                     &lt;/restriction>
                 *                                   &lt;/simpleType>
                 *                                 &lt;/element>
                 *                               &lt;/choice>
                 *                             &lt;/choice>
                 *                             &lt;element name="vCOFINS">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="infAdProd" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="500"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="nItem" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;pattern value="^\d{1,3}$"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "prod",
                    "imposto",
                    "infAdProd"
                })
                public static class Det {

                    @XmlElement(required = true)
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod prod;
                    @XmlElement(required = true)
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto imposto;
                    protected String infAdProd;
                    @XmlAttribute(name = "nItem", required = true)
                    protected String nItem;

                    /**
                     * Obtém o valor da propriedade prod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod getProd() {
                        return prod;
                    }

                    /**
                     * Define o valor da propriedade prod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod }
                     *     
                     */
                    public void setProd(EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod value) {
                        this.prod = value;
                    }

                    /**
                     * Obtém o valor da propriedade imposto.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto getImposto() {
                        return imposto;
                    }

                    /**
                     * Define o valor da propriedade imposto.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto }
                     *     
                     */
                    public void setImposto(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto value) {
                        this.imposto = value;
                    }

                    /**
                     * Obtém o valor da propriedade infAdProd.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInfAdProd() {
                        return infAdProd;
                    }

                    /**
                     * Define o valor da propriedade infAdProd.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInfAdProd(String value) {
                        this.infAdProd = value;
                    }

                    /**
                     * Obtém o valor da propriedade nItem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNItem() {
                        return nItem;
                    }

                    /**
                     * Define o valor da propriedade nItem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNItem(String value) {
                        this.nItem = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="vItem12741" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;choice>
                     *           &lt;element name="ICMS">
                     *             &lt;complexType>
                     *               &lt;complexContent>
                     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                   &lt;choice>
                     *                     &lt;element name="ICMS00">
                     *                       &lt;complexType>
                     *                         &lt;complexContent>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                             &lt;sequence>
                     *                               &lt;element name="Orig">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="CST">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="pICMS">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="vICMS">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                             &lt;/sequence>
                     *                           &lt;/restriction>
                     *                         &lt;/complexContent>
                     *                       &lt;/complexType>
                     *                     &lt;/element>
                     *                     &lt;element name="ICMS40">
                     *                       &lt;complexType>
                     *                         &lt;complexContent>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                             &lt;sequence>
                     *                               &lt;element name="Orig">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="CST">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                             &lt;/sequence>
                     *                           &lt;/restriction>
                     *                         &lt;/complexContent>
                     *                       &lt;/complexType>
                     *                     &lt;/element>
                     *                     &lt;element name="ICMSSN102">
                     *                       &lt;complexType>
                     *                         &lt;complexContent>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                             &lt;sequence>
                     *                               &lt;element name="Orig">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="CSOSN">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{3}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                             &lt;/sequence>
                     *                           &lt;/restriction>
                     *                         &lt;/complexContent>
                     *                       &lt;/complexType>
                     *                     &lt;/element>
                     *                     &lt;element name="ICMSSN900">
                     *                       &lt;complexType>
                     *                         &lt;complexContent>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                             &lt;sequence>
                     *                               &lt;element name="Orig">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="CSOSN">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{3}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="pICMS">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                               &lt;element name="vICMS">
                     *                                 &lt;simpleType>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                     &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                   &lt;/restriction>
                     *                                 &lt;/simpleType>
                     *                               &lt;/element>
                     *                             &lt;/sequence>
                     *                           &lt;/restriction>
                     *                         &lt;/complexContent>
                     *                       &lt;/complexType>
                     *                     &lt;/element>
                     *                   &lt;/choice>
                     *                 &lt;/restriction>
                     *               &lt;/complexContent>
                     *             &lt;/complexType>
                     *           &lt;/element>
                     *           &lt;element name="ISSQN">
                     *             &lt;complexType>
                     *               &lt;complexContent>
                     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                   &lt;sequence>
                     *                     &lt;element name="vDeducISSQN">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="vBC">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="vAliq">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="vISSQN">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="cMunFG" minOccurs="0">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{7}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="cListServ" minOccurs="0">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;length value="5"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="cServTribMun" minOccurs="0">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;length value="20"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="cNatOp">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d{2}$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                     &lt;element name="indIncFisc">
                     *                       &lt;simpleType>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                           &lt;pattern value="^\d*[1-2]$"/>
                     *                         &lt;/restriction>
                     *                       &lt;/simpleType>
                     *                     &lt;/element>
                     *                   &lt;/sequence>
                     *                 &lt;/restriction>
                     *               &lt;/complexContent>
                     *             &lt;/complexType>
                     *           &lt;/element>
                     *         &lt;/choice>
                     *         &lt;element name="PIS">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;choice>
                     *                   &lt;element name="PISAliq">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vBC">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="pPIS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1}\.\d{1,4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vPIS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="PISQtde">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="qBCProd">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vAliqProd">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vPIS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="PISNT">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="PISSN">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="PISOutr">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;choice>
                     *                               &lt;choice maxOccurs="2" minOccurs="2">
                     *                                 &lt;element name="vBC" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                                 &lt;element name="pPIS" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                               &lt;/choice>
                     *                               &lt;choice maxOccurs="2" minOccurs="2">
                     *                                 &lt;element name="qBCProd" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                                 &lt;element name="vAliqProd" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                               &lt;/choice>
                     *                             &lt;/choice>
                     *                             &lt;element name="vPIS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/choice>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PISST" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;choice>
                     *                     &lt;choice maxOccurs="2" minOccurs="2">
                     *                       &lt;element name="vBC" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                       &lt;element name="pPIS" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                     &lt;/choice>
                     *                     &lt;choice maxOccurs="2" minOccurs="2">
                     *                       &lt;element name="qBCProd" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                       &lt;element name="vAliqProd" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                     &lt;/choice>
                     *                   &lt;/choice>
                     *                   &lt;element name="vPIS">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="COFINS">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;choice>
                     *                   &lt;element name="COFINSAliq">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vBC">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="pCOFINS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vCOFINS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="COFINSQtde">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="qBCProd">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vAliqProd">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;element name="vCOFINS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="COFINSNT">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="COFINSSN">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="COFINSOutr">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="CST">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                             &lt;choice>
                     *                               &lt;choice maxOccurs="2" minOccurs="2">
                     *                                 &lt;element name="vBC" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                                 &lt;element name="pCOFINS" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                               &lt;/choice>
                     *                               &lt;choice maxOccurs="2" minOccurs="2">
                     *                                 &lt;element name="qBCProd" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                                 &lt;element name="vAliqProd" minOccurs="0">
                     *                                   &lt;simpleType>
                     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                       &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                                     &lt;/restriction>
                     *                                   &lt;/simpleType>
                     *                                 &lt;/element>
                     *                               &lt;/choice>
                     *                             &lt;/choice>
                     *                             &lt;element name="vCOFINS">
                     *                               &lt;simpleType>
                     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                                 &lt;/restriction>
                     *                               &lt;/simpleType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/choice>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="COFINSST" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;choice>
                     *                     &lt;choice maxOccurs="2" minOccurs="2">
                     *                       &lt;element name="vBC" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                       &lt;element name="pCOFINS" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                     &lt;/choice>
                     *                     &lt;choice maxOccurs="2" minOccurs="2">
                     *                       &lt;element name="qBCProd" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                       &lt;element name="vAliqProd" minOccurs="0">
                     *                         &lt;simpleType>
                     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *                           &lt;/restriction>
                     *                         &lt;/simpleType>
                     *                       &lt;/element>
                     *                     &lt;/choice>
                     *                   &lt;/choice>
                     *                   &lt;element name="vCOFINS">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vItem12741",
                        "icms",
                        "issqn",
                        "pis",
                        "pisst",
                        "cofins",
                        "cofinsst"
                    })
                    public static class Imposto {

                        protected String vItem12741;
                        @XmlElement(name = "ICMS")
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS icms;
                        @XmlElement(name = "ISSQN")
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ISSQN issqn;
                        @XmlElement(name = "PIS", required = true)
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS pis;
                        @XmlElement(name = "PISST")
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PISST pisst;
                        @XmlElement(name = "COFINS", required = true)
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS cofins;
                        @XmlElement(name = "COFINSST")
                        protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINSST cofinsst;

                        /**
                         * Obtém o valor da propriedade vItem12741.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVItem12741() {
                            return vItem12741;
                        }

                        /**
                         * Define o valor da propriedade vItem12741.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVItem12741(String value) {
                            this.vItem12741 = value;
                        }

                        /**
                         * Obtém o valor da propriedade icms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS getICMS() {
                            return icms;
                        }

                        /**
                         * Define o valor da propriedade icms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS }
                         *     
                         */
                        public void setICMS(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS value) {
                            this.icms = value;
                        }

                        /**
                         * Obtém o valor da propriedade issqn.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ISSQN }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ISSQN getISSQN() {
                            return issqn;
                        }

                        /**
                         * Define o valor da propriedade issqn.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ISSQN }
                         *     
                         */
                        public void setISSQN(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ISSQN value) {
                            this.issqn = value;
                        }

                        /**
                         * Obtém o valor da propriedade pis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS getPIS() {
                            return pis;
                        }

                        /**
                         * Define o valor da propriedade pis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS }
                         *     
                         */
                        public void setPIS(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS value) {
                            this.pis = value;
                        }

                        /**
                         * Obtém o valor da propriedade pisst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PISST }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PISST getPISST() {
                            return pisst;
                        }

                        /**
                         * Define o valor da propriedade pisst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PISST }
                         *     
                         */
                        public void setPISST(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PISST value) {
                            this.pisst = value;
                        }

                        /**
                         * Obtém o valor da propriedade cofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS getCOFINS() {
                            return cofins;
                        }

                        /**
                         * Define o valor da propriedade cofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS }
                         *     
                         */
                        public void setCOFINS(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS value) {
                            this.cofins = value;
                        }

                        /**
                         * Obtém o valor da propriedade cofinsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINSST }
                         *     
                         */
                        public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINSST getCOFINSST() {
                            return cofinsst;
                        }

                        /**
                         * Define o valor da propriedade cofinsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINSST }
                         *     
                         */
                        public void setCOFINSST(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINSST value) {
                            this.cofinsst = value;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;choice>
                         *         &lt;element name="COFINSAliq">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vBC">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="pCOFINS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vCOFINS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="COFINSQtde">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="qBCProd">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vAliqProd">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vCOFINS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="COFINSNT">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="COFINSSN">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="COFINSOutr">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;choice>
                         *                     &lt;choice maxOccurs="2" minOccurs="2">
                         *                       &lt;element name="vBC" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                       &lt;element name="pCOFINS" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                     &lt;/choice>
                         *                     &lt;choice maxOccurs="2" minOccurs="2">
                         *                       &lt;element name="qBCProd" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                       &lt;element name="vAliqProd" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                     &lt;/choice>
                         *                   &lt;/choice>
                         *                   &lt;element name="vCOFINS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/choice>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "cofinsAliq",
                            "cofinsQtde",
                            "cofinsnt",
                            "cofinssn",
                            "cofinsOutr"
                        })
                        public static class COFINS {

                            @XmlElement(name = "COFINSAliq")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSAliq cofinsAliq;
                            @XmlElement(name = "COFINSQtde")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSQtde cofinsQtde;
                            @XmlElement(name = "COFINSNT")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT cofinsnt;
                            @XmlElement(name = "COFINSSN")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSSN cofinssn;
                            @XmlElement(name = "COFINSOutr")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSOutr cofinsOutr;

                            /**
                             * Obtém o valor da propriedade cofinsAliq.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSAliq }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSAliq getCOFINSAliq() {
                                return cofinsAliq;
                            }

                            /**
                             * Define o valor da propriedade cofinsAliq.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSAliq }
                             *     
                             */
                            public void setCOFINSAliq(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSAliq value) {
                                this.cofinsAliq = value;
                            }

                            /**
                             * Obtém o valor da propriedade cofinsQtde.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSQtde }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSQtde getCOFINSQtde() {
                                return cofinsQtde;
                            }

                            /**
                             * Define o valor da propriedade cofinsQtde.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSQtde }
                             *     
                             */
                            public void setCOFINSQtde(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSQtde value) {
                                this.cofinsQtde = value;
                            }

                            /**
                             * Obtém o valor da propriedade cofinsnt.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT getCOFINSNT() {
                                return cofinsnt;
                            }

                            /**
                             * Define o valor da propriedade cofinsnt.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT }
                             *     
                             */
                            public void setCOFINSNT(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT value) {
                                this.cofinsnt = value;
                            }

                            /**
                             * Obtém o valor da propriedade cofinssn.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSSN }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSSN getCOFINSSN() {
                                return cofinssn;
                            }

                            /**
                             * Define o valor da propriedade cofinssn.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSSN }
                             *     
                             */
                            public void setCOFINSSN(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSSN value) {
                                this.cofinssn = value;
                            }

                            /**
                             * Obtém o valor da propriedade cofinsOutr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSOutr }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSOutr getCOFINSOutr() {
                                return cofinsOutr;
                            }

                            /**
                             * Define o valor da propriedade cofinsOutr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSOutr }
                             *     
                             */
                            public void setCOFINSOutr(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSOutr value) {
                                this.cofinsOutr = value;
                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vBC">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="pCOFINS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vCOFINS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "vbc",
                                "pcofins",
                                "vcofins"
                            })
                            public static class COFINSAliq {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElement(name = "vBC", required = true)
                                protected String vbc;
                                @XmlElement(name = "pCOFINS", required = true)
                                protected String pcofins;
                                @XmlElement(name = "vCOFINS", required = true)
                                protected String vcofins;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vbc.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVBC() {
                                    return vbc;
                                }

                                /**
                                 * Define o valor da propriedade vbc.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVBC(String value) {
                                    this.vbc = value;
                                }

                                /**
                                 * Obtém o valor da propriedade pcofins.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPCOFINS() {
                                    return pcofins;
                                }

                                /**
                                 * Define o valor da propriedade pcofins.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPCOFINS(String value) {
                                    this.pcofins = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vcofins.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVCOFINS() {
                                    return vcofins;
                                }

                                /**
                                 * Define o valor da propriedade vcofins.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVCOFINS(String value) {
                                    this.vcofins = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst"
                            })
                            public static class COFINSNT {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;choice>
                             *           &lt;choice maxOccurs="2" minOccurs="2">
                             *             &lt;element name="vBC" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *             &lt;element name="pCOFINS" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *           &lt;/choice>
                             *           &lt;choice maxOccurs="2" minOccurs="2">
                             *             &lt;element name="qBCProd" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *             &lt;element name="vAliqProd" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *           &lt;/choice>
                             *         &lt;/choice>
                             *         &lt;element name="vCOFINS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "vbcOrPCOFINS",
                                "qbcProdOrVAliqProd",
                                "vcofins"
                            })
                            public static class COFINSOutr {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElementRefs({
                                    @XmlElementRef(name = "vBC", type = JAXBElement.class, required = false),
                                    @XmlElementRef(name = "pCOFINS", type = JAXBElement.class, required = false)
                                })
                                protected List<JAXBElement<String>> vbcOrPCOFINS;
                                @XmlElementRefs({
                                    @XmlElementRef(name = "qBCProd", type = JAXBElement.class, required = false),
                                    @XmlElementRef(name = "vAliqProd", type = JAXBElement.class, required = false)
                                })
                                protected List<JAXBElement<String>> qbcProdOrVAliqProd;
                                @XmlElement(name = "vCOFINS", required = true)
                                protected String vcofins;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Gets the value of the vbcOrPCOFINS property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the vbcOrPCOFINS property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getVBCOrPCOFINS().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * 
                                 * 
                                 */
                                public List<JAXBElement<String>> getVBCOrPCOFINS() {
                                    if (vbcOrPCOFINS == null) {
                                        vbcOrPCOFINS = new ArrayList<JAXBElement<String>>();
                                    }
                                    return this.vbcOrPCOFINS;
                                }

                                /**
                                 * Gets the value of the qbcProdOrVAliqProd property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the qbcProdOrVAliqProd property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getQBCProdOrVAliqProd().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * 
                                 * 
                                 */
                                public List<JAXBElement<String>> getQBCProdOrVAliqProd() {
                                    if (qbcProdOrVAliqProd == null) {
                                        qbcProdOrVAliqProd = new ArrayList<JAXBElement<String>>();
                                    }
                                    return this.qbcProdOrVAliqProd;
                                }

                                /**
                                 * Obtém o valor da propriedade vcofins.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVCOFINS() {
                                    return vcofins;
                                }

                                /**
                                 * Define o valor da propriedade vcofins.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVCOFINS(String value) {
                                    this.vcofins = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="qBCProd">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vAliqProd">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vCOFINS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "qbcProd",
                                "vAliqProd",
                                "vcofins"
                            })
                            public static class COFINSQtde {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElement(name = "qBCProd", required = true)
                                protected String qbcProd;
                                @XmlElement(required = true)
                                protected String vAliqProd;
                                @XmlElement(name = "vCOFINS", required = true)
                                protected String vcofins;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Obtém o valor da propriedade qbcProd.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getQBCProd() {
                                    return qbcProd;
                                }

                                /**
                                 * Define o valor da propriedade qbcProd.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setQBCProd(String value) {
                                    this.qbcProd = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vAliqProd.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVAliqProd() {
                                    return vAliqProd;
                                }

                                /**
                                 * Define o valor da propriedade vAliqProd.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVAliqProd(String value) {
                                    this.vAliqProd = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vcofins.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVCOFINS() {
                                    return vcofins;
                                }

                                /**
                                 * Define o valor da propriedade vcofins.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVCOFINS(String value) {
                                    this.vcofins = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst"
                            })
                            public static class COFINSSN {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;choice>
                         *           &lt;choice maxOccurs="2" minOccurs="2">
                         *             &lt;element name="vBC" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *             &lt;element name="pCOFINS" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *           &lt;/choice>
                         *           &lt;choice maxOccurs="2" minOccurs="2">
                         *             &lt;element name="qBCProd" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *             &lt;element name="vAliqProd" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *           &lt;/choice>
                         *         &lt;/choice>
                         *         &lt;element name="vCOFINS">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "vbcOrPCOFINS",
                            "qbcProdOrVAliqProd",
                            "vcofins"
                        })
                        public static class COFINSST {

                            @XmlElementRefs({
                                @XmlElementRef(name = "vBC", type = JAXBElement.class, required = false),
                                @XmlElementRef(name = "pCOFINS", type = JAXBElement.class, required = false)
                            })
                            protected List<JAXBElement<String>> vbcOrPCOFINS;
                            @XmlElementRefs({
                                @XmlElementRef(name = "qBCProd", type = JAXBElement.class, required = false),
                                @XmlElementRef(name = "vAliqProd", type = JAXBElement.class, required = false)
                            })
                            protected List<JAXBElement<String>> qbcProdOrVAliqProd;
                            @XmlElement(name = "vCOFINS", required = true)
                            protected String vcofins;

                            /**
                             * Gets the value of the vbcOrPCOFINS property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the vbcOrPCOFINS property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getVBCOrPCOFINS().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * 
                             * 
                             */
                            public List<JAXBElement<String>> getVBCOrPCOFINS() {
                                if (vbcOrPCOFINS == null) {
                                    vbcOrPCOFINS = new ArrayList<JAXBElement<String>>();
                                }
                                return this.vbcOrPCOFINS;
                            }

                            /**
                             * Gets the value of the qbcProdOrVAliqProd property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the qbcProdOrVAliqProd property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getQBCProdOrVAliqProd().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * 
                             * 
                             */
                            public List<JAXBElement<String>> getQBCProdOrVAliqProd() {
                                if (qbcProdOrVAliqProd == null) {
                                    qbcProdOrVAliqProd = new ArrayList<JAXBElement<String>>();
                                }
                                return this.qbcProdOrVAliqProd;
                            }

                            /**
                             * Obtém o valor da propriedade vcofins.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVCOFINS() {
                                return vcofins;
                            }

                            /**
                             * Define o valor da propriedade vcofins.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVCOFINS(String value) {
                                this.vcofins = value;
                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;choice>
                         *         &lt;element name="ICMS00">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Orig">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="pICMS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vICMS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ICMS40">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Orig">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ICMSSN102">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Orig">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="CSOSN">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{3}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ICMSSN900">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Orig">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="CSOSN">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{3}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="pICMS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vICMS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/choice>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "icms00",
                            "icms40",
                            "icmssn102",
                            "icmssn900"
                        })
                        public static class ICMS {

                            @XmlElement(name = "ICMS00")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 icms00;
                            @XmlElement(name = "ICMS40")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS40 icms40;
                            @XmlElement(name = "ICMSSN102")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN102 icmssn102;
                            @XmlElement(name = "ICMSSN900")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN900 icmssn900;

                            /**
                             * Obtém o valor da propriedade icms00.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 getICMS00() {
                                return icms00;
                            }

                            /**
                             * Define o valor da propriedade icms00.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 }
                             *     
                             */
                            public void setICMS00(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 value) {
                                this.icms00 = value;
                            }

                            /**
                             * Obtém o valor da propriedade icms40.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS40 }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS40 getICMS40() {
                                return icms40;
                            }

                            /**
                             * Define o valor da propriedade icms40.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS40 }
                             *     
                             */
                            public void setICMS40(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS40 value) {
                                this.icms40 = value;
                            }

                            /**
                             * Obtém o valor da propriedade icmssn102.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN102 }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN102 getICMSSN102() {
                                return icmssn102;
                            }

                            /**
                             * Define o valor da propriedade icmssn102.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN102 }
                             *     
                             */
                            public void setICMSSN102(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN102 value) {
                                this.icmssn102 = value;
                            }

                            /**
                             * Obtém o valor da propriedade icmssn900.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN900 }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN900 getICMSSN900() {
                                return icmssn900;
                            }

                            /**
                             * Define o valor da propriedade icmssn900.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN900 }
                             *     
                             */
                            public void setICMSSN900(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMSSN900 value) {
                                this.icmssn900 = value;
                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Orig">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="pICMS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vICMS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "orig",
                                "cst",
                                "picms",
                                "vicms"
                            })
                            public static class ICMS00 {

                                @XmlElement(name = "Orig", required = true)
                                protected String orig;
                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElement(name = "pICMS", required = true)
                                protected String picms;
                                @XmlElement(name = "vICMS", required = true)
                                protected String vicms;

                                /**
                                 * Obtém o valor da propriedade orig.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOrig() {
                                    return orig;
                                }

                                /**
                                 * Define o valor da propriedade orig.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOrig(String value) {
                                    this.orig = value;
                                }

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Obtém o valor da propriedade picms.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPICMS() {
                                    return picms;
                                }

                                /**
                                 * Define o valor da propriedade picms.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPICMS(String value) {
                                    this.picms = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vicms.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVICMS() {
                                    return vicms;
                                }

                                /**
                                 * Define o valor da propriedade vicms.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVICMS(String value) {
                                    this.vicms = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Orig">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "orig",
                                "cst"
                            })
                            public static class ICMS40 {

                                @XmlElement(name = "Orig", required = true)
                                protected String orig;
                                @XmlElement(name = "CST", required = true)
                                protected String cst;

                                /**
                                 * Obtém o valor da propriedade orig.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOrig() {
                                    return orig;
                                }

                                /**
                                 * Define o valor da propriedade orig.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOrig(String value) {
                                    this.orig = value;
                                }

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Orig">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="CSOSN">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{3}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "orig",
                                "csosn"
                            })
                            public static class ICMSSN102 {

                                @XmlElement(name = "Orig", required = true)
                                protected String orig;
                                @XmlElement(name = "CSOSN", required = true)
                                protected String csosn;

                                /**
                                 * Obtém o valor da propriedade orig.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOrig() {
                                    return orig;
                                }

                                /**
                                 * Define o valor da propriedade orig.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOrig(String value) {
                                    this.orig = value;
                                }

                                /**
                                 * Obtém o valor da propriedade csosn.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCSOSN() {
                                    return csosn;
                                }

                                /**
                                 * Define o valor da propriedade csosn.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCSOSN(String value) {
                                    this.csosn = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="Orig">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="CSOSN">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{3}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="pICMS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,3}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vICMS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "orig",
                                "csosn",
                                "picms",
                                "vicms"
                            })
                            public static class ICMSSN900 {

                                @XmlElement(name = "Orig", required = true)
                                protected String orig;
                                @XmlElement(name = "CSOSN", required = true)
                                protected String csosn;
                                @XmlElement(name = "pICMS", required = true)
                                protected String picms;
                                @XmlElement(name = "vICMS", required = true)
                                protected String vicms;

                                /**
                                 * Obtém o valor da propriedade orig.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOrig() {
                                    return orig;
                                }

                                /**
                                 * Define o valor da propriedade orig.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOrig(String value) {
                                    this.orig = value;
                                }

                                /**
                                 * Obtém o valor da propriedade csosn.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCSOSN() {
                                    return csosn;
                                }

                                /**
                                 * Define o valor da propriedade csosn.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCSOSN(String value) {
                                    this.csosn = value;
                                }

                                /**
                                 * Obtém o valor da propriedade picms.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPICMS() {
                                    return picms;
                                }

                                /**
                                 * Define o valor da propriedade picms.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPICMS(String value) {
                                    this.picms = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vicms.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVICMS() {
                                    return vicms;
                                }

                                /**
                                 * Define o valor da propriedade vicms.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVICMS(String value) {
                                    this.vicms = value;
                                }

                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="vDeducISSQN">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="vBC">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="vAliq">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{3}[.]{1}[0-9]{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="vISSQN">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="cMunFG" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{7}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="cListServ" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;length value="5"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="cServTribMun" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;length value="20"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="cNatOp">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="indIncFisc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d*[1-2]$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "vDeducISSQN",
                            "vbc",
                            "vAliq",
                            "vissqn",
                            "cMunFG",
                            "cListServ",
                            "cServTribMun",
                            "cNatOp",
                            "indIncFisc"
                        })
                        public static class ISSQN {

                            @XmlElement(required = true)
                            protected String vDeducISSQN;
                            @XmlElement(name = "vBC", required = true)
                            protected String vbc;
                            @XmlElement(required = true)
                            protected String vAliq;
                            @XmlElement(name = "vISSQN", required = true)
                            protected String vissqn;
                            protected String cMunFG;
                            protected String cListServ;
                            protected String cServTribMun;
                            @XmlElement(required = true)
                            protected String cNatOp;
                            @XmlElement(required = true)
                            protected String indIncFisc;

                            /**
                             * Obtém o valor da propriedade vDeducISSQN.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVDeducISSQN() {
                                return vDeducISSQN;
                            }

                            /**
                             * Define o valor da propriedade vDeducISSQN.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVDeducISSQN(String value) {
                                this.vDeducISSQN = value;
                            }

                            /**
                             * Obtém o valor da propriedade vbc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVBC() {
                                return vbc;
                            }

                            /**
                             * Define o valor da propriedade vbc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVBC(String value) {
                                this.vbc = value;
                            }

                            /**
                             * Obtém o valor da propriedade vAliq.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVAliq() {
                                return vAliq;
                            }

                            /**
                             * Define o valor da propriedade vAliq.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVAliq(String value) {
                                this.vAliq = value;
                            }

                            /**
                             * Obtém o valor da propriedade vissqn.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVISSQN() {
                                return vissqn;
                            }

                            /**
                             * Define o valor da propriedade vissqn.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVISSQN(String value) {
                                this.vissqn = value;
                            }

                            /**
                             * Obtém o valor da propriedade cMunFG.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCMunFG() {
                                return cMunFG;
                            }

                            /**
                             * Define o valor da propriedade cMunFG.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCMunFG(String value) {
                                this.cMunFG = value;
                            }

                            /**
                             * Obtém o valor da propriedade cListServ.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCListServ() {
                                return cListServ;
                            }

                            /**
                             * Define o valor da propriedade cListServ.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCListServ(String value) {
                                this.cListServ = value;
                            }

                            /**
                             * Obtém o valor da propriedade cServTribMun.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCServTribMun() {
                                return cServTribMun;
                            }

                            /**
                             * Define o valor da propriedade cServTribMun.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCServTribMun(String value) {
                                this.cServTribMun = value;
                            }

                            /**
                             * Obtém o valor da propriedade cNatOp.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCNatOp() {
                                return cNatOp;
                            }

                            /**
                             * Define o valor da propriedade cNatOp.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCNatOp(String value) {
                                this.cNatOp = value;
                            }

                            /**
                             * Obtém o valor da propriedade indIncFisc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIndIncFisc() {
                                return indIncFisc;
                            }

                            /**
                             * Define o valor da propriedade indIncFisc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIndIncFisc(String value) {
                                this.indIncFisc = value;
                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;choice>
                         *         &lt;element name="PISAliq">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vBC">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="pPIS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1}\.\d{1,4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vPIS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="PISQtde">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="qBCProd">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vAliqProd">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;element name="vPIS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="PISNT">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="PISSN">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="PISOutr">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="CST">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{2}"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                   &lt;choice>
                         *                     &lt;choice maxOccurs="2" minOccurs="2">
                         *                       &lt;element name="vBC" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                       &lt;element name="pPIS" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                     &lt;/choice>
                         *                     &lt;choice maxOccurs="2" minOccurs="2">
                         *                       &lt;element name="qBCProd" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                       &lt;element name="vAliqProd" minOccurs="0">
                         *                         &lt;simpleType>
                         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                             &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                           &lt;/restriction>
                         *                         &lt;/simpleType>
                         *                       &lt;/element>
                         *                     &lt;/choice>
                         *                   &lt;/choice>
                         *                   &lt;element name="vPIS">
                         *                     &lt;simpleType>
                         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                       &lt;/restriction>
                         *                     &lt;/simpleType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/choice>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "pisAliq",
                            "pisQtde",
                            "pisnt",
                            "pissn",
                            "pisOutr"
                        })
                        public static class PIS {

                            @XmlElement(name = "PISAliq")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISAliq pisAliq;
                            @XmlElement(name = "PISQtde")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISQtde pisQtde;
                            @XmlElement(name = "PISNT")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT pisnt;
                            @XmlElement(name = "PISSN")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISSN pissn;
                            @XmlElement(name = "PISOutr")
                            protected EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISOutr pisOutr;

                            /**
                             * Obtém o valor da propriedade pisAliq.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISAliq }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISAliq getPISAliq() {
                                return pisAliq;
                            }

                            /**
                             * Define o valor da propriedade pisAliq.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISAliq }
                             *     
                             */
                            public void setPISAliq(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISAliq value) {
                                this.pisAliq = value;
                            }

                            /**
                             * Obtém o valor da propriedade pisQtde.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISQtde }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISQtde getPISQtde() {
                                return pisQtde;
                            }

                            /**
                             * Define o valor da propriedade pisQtde.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISQtde }
                             *     
                             */
                            public void setPISQtde(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISQtde value) {
                                this.pisQtde = value;
                            }

                            /**
                             * Obtém o valor da propriedade pisnt.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT getPISNT() {
                                return pisnt;
                            }

                            /**
                             * Define o valor da propriedade pisnt.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT }
                             *     
                             */
                            public void setPISNT(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT value) {
                                this.pisnt = value;
                            }

                            /**
                             * Obtém o valor da propriedade pissn.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISSN }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISSN getPISSN() {
                                return pissn;
                            }

                            /**
                             * Define o valor da propriedade pissn.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISSN }
                             *     
                             */
                            public void setPISSN(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISSN value) {
                                this.pissn = value;
                            }

                            /**
                             * Obtém o valor da propriedade pisOutr.
                             * 
                             * @return
                             *     possible object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISOutr }
                             *     
                             */
                            public EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISOutr getPISOutr() {
                                return pisOutr;
                            }

                            /**
                             * Define o valor da propriedade pisOutr.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISOutr }
                             *     
                             */
                            public void setPISOutr(EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISOutr value) {
                                this.pisOutr = value;
                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vBC">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="pPIS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1}\.\d{1,4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vPIS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "vbc",
                                "ppis",
                                "vpis"
                            })
                            public static class PISAliq {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElement(name = "vBC", required = true)
                                protected String vbc;
                                @XmlElement(name = "pPIS", required = true)
                                protected String ppis;
                                @XmlElement(name = "vPIS", required = true)
                                protected String vpis;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vbc.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVBC() {
                                    return vbc;
                                }

                                /**
                                 * Define o valor da propriedade vbc.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVBC(String value) {
                                    this.vbc = value;
                                }

                                /**
                                 * Obtém o valor da propriedade ppis.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getPPIS() {
                                    return ppis;
                                }

                                /**
                                 * Define o valor da propriedade ppis.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setPPIS(String value) {
                                    this.ppis = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vpis.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVPIS() {
                                    return vpis;
                                }

                                /**
                                 * Define o valor da propriedade vpis.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVPIS(String value) {
                                    this.vpis = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst"
                            })
                            public static class PISNT {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;choice>
                             *           &lt;choice maxOccurs="2" minOccurs="2">
                             *             &lt;element name="vBC" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *             &lt;element name="pPIS" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *           &lt;/choice>
                             *           &lt;choice maxOccurs="2" minOccurs="2">
                             *             &lt;element name="qBCProd" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *             &lt;element name="vAliqProd" minOccurs="0">
                             *               &lt;simpleType>
                             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                             *                 &lt;/restriction>
                             *               &lt;/simpleType>
                             *             &lt;/element>
                             *           &lt;/choice>
                             *         &lt;/choice>
                             *         &lt;element name="vPIS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "vbcOrPPIS",
                                "qbcProdOrVAliqProd",
                                "vpis"
                            })
                            public static class PISOutr {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElementRefs({
                                    @XmlElementRef(name = "vBC", type = JAXBElement.class, required = false),
                                    @XmlElementRef(name = "pPIS", type = JAXBElement.class, required = false)
                                })
                                protected List<JAXBElement<String>> vbcOrPPIS;
                                @XmlElementRefs({
                                    @XmlElementRef(name = "vAliqProd", type = JAXBElement.class, required = false),
                                    @XmlElementRef(name = "qBCProd", type = JAXBElement.class, required = false)
                                })
                                protected List<JAXBElement<String>> qbcProdOrVAliqProd;
                                @XmlElement(name = "vPIS", required = true)
                                protected String vpis;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Gets the value of the vbcOrPPIS property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the vbcOrPPIS property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getVBCOrPPIS().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * 
                                 * 
                                 */
                                public List<JAXBElement<String>> getVBCOrPPIS() {
                                    if (vbcOrPPIS == null) {
                                        vbcOrPPIS = new ArrayList<JAXBElement<String>>();
                                    }
                                    return this.vbcOrPPIS;
                                }

                                /**
                                 * Gets the value of the qbcProdOrVAliqProd property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the qbcProdOrVAliqProd property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getQBCProdOrVAliqProd().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                                 * 
                                 * 
                                 */
                                public List<JAXBElement<String>> getQBCProdOrVAliqProd() {
                                    if (qbcProdOrVAliqProd == null) {
                                        qbcProdOrVAliqProd = new ArrayList<JAXBElement<String>>();
                                    }
                                    return this.qbcProdOrVAliqProd;
                                }

                                /**
                                 * Obtém o valor da propriedade vpis.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVPIS() {
                                    return vpis;
                                }

                                /**
                                 * Define o valor da propriedade vpis.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVPIS(String value) {
                                    this.vpis = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="qBCProd">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vAliqProd">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *         &lt;element name="vPIS">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst",
                                "qbcProd",
                                "vAliqProd",
                                "vpis"
                            })
                            public static class PISQtde {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;
                                @XmlElement(name = "qBCProd", required = true)
                                protected String qbcProd;
                                @XmlElement(required = true)
                                protected String vAliqProd;
                                @XmlElement(name = "vPIS", required = true)
                                protected String vpis;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                                /**
                                 * Obtém o valor da propriedade qbcProd.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getQBCProd() {
                                    return qbcProd;
                                }

                                /**
                                 * Define o valor da propriedade qbcProd.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setQBCProd(String value) {
                                    this.qbcProd = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vAliqProd.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVAliqProd() {
                                    return vAliqProd;
                                }

                                /**
                                 * Define o valor da propriedade vAliqProd.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVAliqProd(String value) {
                                    this.vAliqProd = value;
                                }

                                /**
                                 * Obtém o valor da propriedade vpis.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getVPIS() {
                                    return vpis;
                                }

                                /**
                                 * Define o valor da propriedade vpis.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setVPIS(String value) {
                                    this.vpis = value;
                                }

                            }


                            /**
                             * <p>Classe Java de anonymous complex type.
                             * 
                             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="CST">
                             *           &lt;simpleType>
                             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                             *               &lt;pattern value="^\d{2}$"/>
                             *             &lt;/restriction>
                             *           &lt;/simpleType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cst"
                            })
                            public static class PISSN {

                                @XmlElement(name = "CST", required = true)
                                protected String cst;

                                /**
                                 * Obtém o valor da propriedade cst.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCST() {
                                    return cst;
                                }

                                /**
                                 * Define o valor da propriedade cst.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCST(String value) {
                                    this.cst = value;
                                }

                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;choice>
                         *           &lt;choice maxOccurs="2" minOccurs="2">
                         *             &lt;element name="vBC" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *             &lt;element name="pPIS" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *           &lt;/choice>
                         *           &lt;choice maxOccurs="2" minOccurs="2">
                         *             &lt;element name="qBCProd" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,12}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *             &lt;element name="vAliqProd" minOccurs="0">
                         *               &lt;simpleType>
                         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *                   &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                         *                 &lt;/restriction>
                         *               &lt;/simpleType>
                         *             &lt;/element>
                         *           &lt;/choice>
                         *         &lt;/choice>
                         *         &lt;element name="vPIS">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;pattern value="^\d{1,13}\.\d{1,2}$"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "vbcOrPPIS",
                            "qbcProdOrVAliqProd",
                            "vpis"
                        })
                        public static class PISST {

                            @XmlElementRefs({
                                @XmlElementRef(name = "pPIS", type = JAXBElement.class, required = false),
                                @XmlElementRef(name = "vBC", type = JAXBElement.class, required = false)
                            })
                            protected List<JAXBElement<String>> vbcOrPPIS;
                            @XmlElementRefs({
                                @XmlElementRef(name = "qBCProd", type = JAXBElement.class, required = false),
                                @XmlElementRef(name = "vAliqProd", type = JAXBElement.class, required = false)
                            })
                            protected List<JAXBElement<String>> qbcProdOrVAliqProd;
                            @XmlElement(name = "vPIS", required = true)
                            protected String vpis;

                            /**
                             * Gets the value of the vbcOrPPIS property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the vbcOrPPIS property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getVBCOrPPIS().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * 
                             * 
                             */
                            public List<JAXBElement<String>> getVBCOrPPIS() {
                                if (vbcOrPPIS == null) {
                                    vbcOrPPIS = new ArrayList<JAXBElement<String>>();
                                }
                                return this.vbcOrPPIS;
                            }

                            /**
                             * Gets the value of the qbcProdOrVAliqProd property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the qbcProdOrVAliqProd property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getQBCProdOrVAliqProd().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * {@link JAXBElement }{@code <}{@link String }{@code >}
                             * 
                             * 
                             */
                            public List<JAXBElement<String>> getQBCProdOrVAliqProd() {
                                if (qbcProdOrVAliqProd == null) {
                                    qbcProdOrVAliqProd = new ArrayList<JAXBElement<String>>();
                                }
                                return this.qbcProdOrVAliqProd;
                            }

                            /**
                             * Obtém o valor da propriedade vpis.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getVPIS() {
                                return vpis;
                            }

                            /**
                             * Define o valor da propriedade vpis.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setVPIS(String value) {
                                this.vpis = value;
                            }

                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cProd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cEAN" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^.{8}$|^.{12}$|^.{13}$|^.{14}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="xProd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="120"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="NCM" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^.{2}$|^.{8}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="CFOP">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{4}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="uCom">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="qCom">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,11}[.]{1}[0-9]{4}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vUnCom">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,12}[.]{1}[0-9]{2,3}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vProd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="indRegra">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;length value="1"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vDesc" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vOutro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vItem">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vRatDesc" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vRatAcr" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="obsFiscoDet" maxOccurs="10" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="xTextoDet">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="60"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="xCampoDet" use="required">
                     *                   &lt;simpleType>
                     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                       &lt;minLength value="1"/>
                     *                       &lt;maxLength value="20"/>
                     *                     &lt;/restriction>
                     *                   &lt;/simpleType>
                     *                 &lt;/attribute>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cProd",
                        "cean",
                        "xProd",
                        "ncm",
                        "cfop",
                        "uCom",
                        "qCom",
                        "vUnCom",
                        "vProd",
                        "indRegra",
                        "vDesc",
                        "vOutro",
                        "vItem",
                        "vRatDesc",
                        "vRatAcr",
                        "obsFiscoDet"
                    })
                    public static class Prod {

                        @XmlElement(required = true)
                        protected String cProd;
                        @XmlElement(name = "cEAN")
                        protected String cean;
                        @XmlElement(required = true)
                        protected String xProd;
                        @XmlElement(name = "NCM")
                        protected String ncm;
                        @XmlElement(name = "CFOP", required = true)
                        protected String cfop;
                        @XmlElement(required = true)
                        protected String uCom;
                        @XmlElement(required = true)
                        protected String qCom;
                        @XmlElement(required = true)
                        protected String vUnCom;
                        @XmlElement(required = true)
                        protected String vProd;
                        @XmlElement(required = true)
                        protected String indRegra;
                        protected String vDesc;
                        protected String vOutro;
                        @XmlElement(required = true)
                        protected String vItem;
                        protected String vRatDesc;
                        protected String vRatAcr;
                        protected List<EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod.ObsFiscoDet> obsFiscoDet;

                        /**
                         * Obtém o valor da propriedade cProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCProd() {
                            return cProd;
                        }

                        /**
                         * Define o valor da propriedade cProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCProd(String value) {
                            this.cProd = value;
                        }

                        /**
                         * Obtém o valor da propriedade cean.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCEAN() {
                            return cean;
                        }

                        /**
                         * Define o valor da propriedade cean.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCEAN(String value) {
                            this.cean = value;
                        }

                        /**
                         * Obtém o valor da propriedade xProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXProd() {
                            return xProd;
                        }

                        /**
                         * Define o valor da propriedade xProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXProd(String value) {
                            this.xProd = value;
                        }

                        /**
                         * Obtém o valor da propriedade ncm.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNCM() {
                            return ncm;
                        }

                        /**
                         * Define o valor da propriedade ncm.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNCM(String value) {
                            this.ncm = value;
                        }

                        /**
                         * Obtém o valor da propriedade cfop.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCFOP() {
                            return cfop;
                        }

                        /**
                         * Define o valor da propriedade cfop.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCFOP(String value) {
                            this.cfop = value;
                        }

                        /**
                         * Obtém o valor da propriedade uCom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUCom() {
                            return uCom;
                        }

                        /**
                         * Define o valor da propriedade uCom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUCom(String value) {
                            this.uCom = value;
                        }

                        /**
                         * Obtém o valor da propriedade qCom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQCom() {
                            return qCom;
                        }

                        /**
                         * Define o valor da propriedade qCom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQCom(String value) {
                            this.qCom = value;
                        }

                        /**
                         * Obtém o valor da propriedade vUnCom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVUnCom() {
                            return vUnCom;
                        }

                        /**
                         * Define o valor da propriedade vUnCom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVUnCom(String value) {
                            this.vUnCom = value;
                        }

                        /**
                         * Obtém o valor da propriedade vProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVProd() {
                            return vProd;
                        }

                        /**
                         * Define o valor da propriedade vProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVProd(String value) {
                            this.vProd = value;
                        }

                        /**
                         * Obtém o valor da propriedade indRegra.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndRegra() {
                            return indRegra;
                        }

                        /**
                         * Define o valor da propriedade indRegra.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndRegra(String value) {
                            this.indRegra = value;
                        }

                        /**
                         * Obtém o valor da propriedade vDesc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVDesc() {
                            return vDesc;
                        }

                        /**
                         * Define o valor da propriedade vDesc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVDesc(String value) {
                            this.vDesc = value;
                        }

                        /**
                         * Obtém o valor da propriedade vOutro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVOutro() {
                            return vOutro;
                        }

                        /**
                         * Define o valor da propriedade vOutro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVOutro(String value) {
                            this.vOutro = value;
                        }

                        /**
                         * Obtém o valor da propriedade vItem.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVItem() {
                            return vItem;
                        }

                        /**
                         * Define o valor da propriedade vItem.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVItem(String value) {
                            this.vItem = value;
                        }

                        /**
                         * Obtém o valor da propriedade vRatDesc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVRatDesc() {
                            return vRatDesc;
                        }

                        /**
                         * Define o valor da propriedade vRatDesc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVRatDesc(String value) {
                            this.vRatDesc = value;
                        }

                        /**
                         * Obtém o valor da propriedade vRatAcr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVRatAcr() {
                            return vRatAcr;
                        }

                        /**
                         * Define o valor da propriedade vRatAcr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVRatAcr(String value) {
                            this.vRatAcr = value;
                        }

                        /**
                         * Gets the value of the obsFiscoDet property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the obsFiscoDet property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getObsFiscoDet().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod.ObsFiscoDet }
                         * 
                         * 
                         */
                        public List<EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod.ObsFiscoDet> getObsFiscoDet() {
                            if (obsFiscoDet == null) {
                                obsFiscoDet = new ArrayList<EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod.ObsFiscoDet>();
                            }
                            return this.obsFiscoDet;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="xTextoDet">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="60"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="xCampoDet" use="required">
                         *         &lt;simpleType>
                         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *             &lt;minLength value="1"/>
                         *             &lt;maxLength value="20"/>
                         *           &lt;/restriction>
                         *         &lt;/simpleType>
                         *       &lt;/attribute>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "xTextoDet"
                        })
                        public static class ObsFiscoDet {

                            @XmlElement(required = true)
                            protected String xTextoDet;
                            @XmlAttribute(name = "xCampoDet", required = true)
                            protected String xCampoDet;

                            /**
                             * Obtém o valor da propriedade xTextoDet.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getXTextoDet() {
                                return xTextoDet;
                            }

                            /**
                             * Define o valor da propriedade xTextoDet.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setXTextoDet(String value) {
                                this.xTextoDet = value;
                            }

                            /**
                             * Obtém o valor da propriedade xCampoDet.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getXCampoDet() {
                                return xCampoDet;
                            }

                            /**
                             * Define o valor da propriedade xCampoDet.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setXCampoDet(String value) {
                                this.xCampoDet = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CNPJ">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{14}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xNome">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xFant" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="enderEmit">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="xLgr">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="nro" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="xCpl" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="xBairro">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="xMun">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="2"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="CEP">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{8}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="IE">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="12"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="IM" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cRegTrib">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cRegTribISSQN" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{1}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="indRatISSQN">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cnpj",
                    "xNome",
                    "xFant",
                    "enderEmit",
                    "ie",
                    "im",
                    "cRegTrib",
                    "cRegTribISSQN",
                    "indRatISSQN"
                })
                public static class Emit {

                    @XmlElement(name = "CNPJ", required = true)
                    protected String cnpj;
                    @XmlElement(required = true)
                    protected String xNome;
                    protected String xFant;
                    @XmlElement(required = true)
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit enderEmit;
                    @XmlElement(name = "IE", required = true)
                    protected String ie;
                    @XmlElement(name = "IM")
                    protected String im;
                    @XmlElement(required = true)
                    protected String cRegTrib;
                    protected String cRegTribISSQN;
                    @XmlElement(required = true)
                    protected String indRatISSQN;

                    /**
                     * Obtém o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obtém o valor da propriedade xNome.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXNome() {
                        return xNome;
                    }

                    /**
                     * Define o valor da propriedade xNome.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXNome(String value) {
                        this.xNome = value;
                    }

                    /**
                     * Obtém o valor da propriedade xFant.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXFant() {
                        return xFant;
                    }

                    /**
                     * Define o valor da propriedade xFant.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXFant(String value) {
                        this.xFant = value;
                    }

                    /**
                     * Obtém o valor da propriedade enderEmit.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit getEnderEmit() {
                        return enderEmit;
                    }

                    /**
                     * Define o valor da propriedade enderEmit.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit }
                     *     
                     */
                    public void setEnderEmit(EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit value) {
                        this.enderEmit = value;
                    }

                    /**
                     * Obtém o valor da propriedade ie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIE() {
                        return ie;
                    }

                    /**
                     * Define o valor da propriedade ie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIE(String value) {
                        this.ie = value;
                    }

                    /**
                     * Obtém o valor da propriedade im.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIM() {
                        return im;
                    }

                    /**
                     * Define o valor da propriedade im.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIM(String value) {
                        this.im = value;
                    }

                    /**
                     * Obtém o valor da propriedade cRegTrib.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCRegTrib() {
                        return cRegTrib;
                    }

                    /**
                     * Define o valor da propriedade cRegTrib.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCRegTrib(String value) {
                        this.cRegTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade cRegTribISSQN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCRegTribISSQN() {
                        return cRegTribISSQN;
                    }

                    /**
                     * Define o valor da propriedade cRegTribISSQN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCRegTribISSQN(String value) {
                        this.cRegTribISSQN = value;
                    }

                    /**
                     * Obtém o valor da propriedade indRatISSQN.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIndRatISSQN() {
                        return indRatISSQN;
                    }

                    /**
                     * Define o valor da propriedade indRatISSQN.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIndRatISSQN(String value) {
                        this.indRatISSQN = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="xLgr">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="nro" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="xCpl" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="xBairro">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="xMun">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="2"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="CEP">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{8}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "xLgr",
                        "nro",
                        "xCpl",
                        "xBairro",
                        "xMun",
                        "cep"
                    })
                    public static class EnderEmit {

                        @XmlElement(required = true)
                        protected String xLgr;
                        protected String nro;
                        protected String xCpl;
                        @XmlElement(required = true)
                        protected String xBairro;
                        @XmlElement(required = true)
                        protected String xMun;
                        @XmlElement(name = "CEP", required = true)
                        protected String cep;

                        /**
                         * Obtém o valor da propriedade xLgr.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXLgr() {
                            return xLgr;
                        }

                        /**
                         * Define o valor da propriedade xLgr.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXLgr(String value) {
                            this.xLgr = value;
                        }

                        /**
                         * Obtém o valor da propriedade nro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNro() {
                            return nro;
                        }

                        /**
                         * Define o valor da propriedade nro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNro(String value) {
                            this.nro = value;
                        }

                        /**
                         * Obtém o valor da propriedade xCpl.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXCpl() {
                            return xCpl;
                        }

                        /**
                         * Define o valor da propriedade xCpl.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXCpl(String value) {
                            this.xCpl = value;
                        }

                        /**
                         * Obtém o valor da propriedade xBairro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXBairro() {
                            return xBairro;
                        }

                        /**
                         * Define o valor da propriedade xBairro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXBairro(String value) {
                            this.xBairro = value;
                        }

                        /**
                         * Obtém o valor da propriedade xMun.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXMun() {
                            return xMun;
                        }

                        /**
                         * Define o valor da propriedade xMun.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXMun(String value) {
                            this.xMun = value;
                        }

                        /**
                         * Obtém o valor da propriedade cep.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCEP() {
                            return cep;
                        }

                        /**
                         * Define o valor da propriedade cep.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCEP(String value) {
                            this.cep = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="xLgr">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nro">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xCpl" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xBairro">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="xMun">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="2"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="UF">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "xLgr",
                    "nro",
                    "xCpl",
                    "xBairro",
                    "xMun",
                    "uf"
                })
                public static class Entrega {

                    @XmlElement(required = true)
                    protected String xLgr;
                    @XmlElement(required = true)
                    protected String nro;
                    protected String xCpl;
                    @XmlElement(required = true)
                    protected String xBairro;
                    @XmlElement(required = true)
                    protected String xMun;
                    @XmlElement(name = "UF", required = true)
                    protected String uf;

                    /**
                     * Obtém o valor da propriedade xLgr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXLgr() {
                        return xLgr;
                    }

                    /**
                     * Define o valor da propriedade xLgr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXLgr(String value) {
                        this.xLgr = value;
                    }

                    /**
                     * Obtém o valor da propriedade nro.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNro() {
                        return nro;
                    }

                    /**
                     * Define o valor da propriedade nro.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNro(String value) {
                        this.nro = value;
                    }

                    /**
                     * Obtém o valor da propriedade xCpl.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXCpl() {
                        return xCpl;
                    }

                    /**
                     * Define o valor da propriedade xCpl.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXCpl(String value) {
                        this.xCpl = value;
                    }

                    /**
                     * Obtém o valor da propriedade xBairro.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXBairro() {
                        return xBairro;
                    }

                    /**
                     * Define o valor da propriedade xBairro.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXBairro(String value) {
                        this.xBairro = value;
                    }

                    /**
                     * Obtém o valor da propriedade xMun.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXMun() {
                        return xMun;
                    }

                    /**
                     * Define o valor da propriedade xMun.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXMun(String value) {
                        this.xMun = value;
                    }

                    /**
                     * Obtém o valor da propriedade uf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUF() {
                        return uf;
                    }

                    /**
                     * Define o valor da propriedade uf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUF(String value) {
                        this.uf = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cUF">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{2}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cNF">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{6}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="mod">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="2"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nserieSAT">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{9}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="nCFe">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{6}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dEmi">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{8}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="hEmi">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{6}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="cDV">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="tpAmb">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="CNPJ">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{14}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="signAC">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="344"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="assinaturaQRCODE">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;length value="344"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="numeroCaixa">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{3}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "cuf",
                    "cnf",
                    "mod",
                    "nserieSAT",
                    "ncFe",
                    "dEmi",
                    "hEmi",
                    "cdv",
                    "tpAmb",
                    "cnpj",
                    "signAC",
                    "assinaturaQRCODE",
                    "numeroCaixa"
                })
                public static class Ide {

                    @XmlElement(name = "cUF", required = true)
                    protected String cuf;
                    @XmlElement(name = "cNF", required = true)
                    protected String cnf;
                    @XmlElement(required = true)
                    protected String mod;
                    @XmlElement(required = true)
                    protected String nserieSAT;
                    @XmlElement(name = "nCFe", required = true)
                    protected String ncFe;
                    @XmlElement(required = true)
                    protected String dEmi;
                    @XmlElement(required = true)
                    protected String hEmi;
                    @XmlElement(name = "cDV", required = true)
                    protected String cdv;
                    @XmlElement(required = true)
                    protected String tpAmb;
                    @XmlElement(name = "CNPJ", required = true)
                    protected String cnpj;
                    @XmlElement(required = true)
                    protected String signAC;
                    @XmlElement(required = true)
                    protected String assinaturaQRCODE;
                    @XmlElement(required = true)
                    protected String numeroCaixa;

                    /**
                     * Obtém o valor da propriedade cuf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCUF() {
                        return cuf;
                    }

                    /**
                     * Define o valor da propriedade cuf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCUF(String value) {
                        this.cuf = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnf.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNF() {
                        return cnf;
                    }

                    /**
                     * Define o valor da propriedade cnf.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNF(String value) {
                        this.cnf = value;
                    }

                    /**
                     * Obtém o valor da propriedade mod.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMod() {
                        return mod;
                    }

                    /**
                     * Define o valor da propriedade mod.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMod(String value) {
                        this.mod = value;
                    }

                    /**
                     * Obtém o valor da propriedade nserieSAT.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNserieSAT() {
                        return nserieSAT;
                    }

                    /**
                     * Define o valor da propriedade nserieSAT.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNserieSAT(String value) {
                        this.nserieSAT = value;
                    }

                    /**
                     * Obtém o valor da propriedade ncFe.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNCFe() {
                        return ncFe;
                    }

                    /**
                     * Define o valor da propriedade ncFe.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNCFe(String value) {
                        this.ncFe = value;
                    }

                    /**
                     * Obtém o valor da propriedade dEmi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDEmi() {
                        return dEmi;
                    }

                    /**
                     * Define o valor da propriedade dEmi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDEmi(String value) {
                        this.dEmi = value;
                    }

                    /**
                     * Obtém o valor da propriedade hEmi.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHEmi() {
                        return hEmi;
                    }

                    /**
                     * Define o valor da propriedade hEmi.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHEmi(String value) {
                        this.hEmi = value;
                    }

                    /**
                     * Obtém o valor da propriedade cdv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCDV() {
                        return cdv;
                    }

                    /**
                     * Define o valor da propriedade cdv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCDV(String value) {
                        this.cdv = value;
                    }

                    /**
                     * Obtém o valor da propriedade tpAmb.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpAmb() {
                        return tpAmb;
                    }

                    /**
                     * Define o valor da propriedade tpAmb.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpAmb(String value) {
                        this.tpAmb = value;
                    }

                    /**
                     * Obtém o valor da propriedade cnpj.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCNPJ() {
                        return cnpj;
                    }

                    /**
                     * Define o valor da propriedade cnpj.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCNPJ(String value) {
                        this.cnpj = value;
                    }

                    /**
                     * Obtém o valor da propriedade signAC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSignAC() {
                        return signAC;
                    }

                    /**
                     * Define o valor da propriedade signAC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSignAC(String value) {
                        this.signAC = value;
                    }

                    /**
                     * Obtém o valor da propriedade assinaturaQRCODE.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAssinaturaQRCODE() {
                        return assinaturaQRCODE;
                    }

                    /**
                     * Define o valor da propriedade assinaturaQRCODE.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAssinaturaQRCODE(String value) {
                        this.assinaturaQRCODE = value;
                    }

                    /**
                     * Obtém o valor da propriedade numeroCaixa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumeroCaixa() {
                        return numeroCaixa;
                    }

                    /**
                     * Define o valor da propriedade numeroCaixa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumeroCaixa(String value) {
                        this.numeroCaixa = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="infCpl" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="5000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="xTexto">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;minLength value="1"/>
                 *                         &lt;maxLength value="60"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="xCampo" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="20"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "infCpl",
                    "obsFisco"
                })
                public static class InfAdic {

                    protected String infCpl;
                    protected List<EnvCFe.LoteCFe.CFe.InfCFe.InfAdic.ObsFisco> obsFisco;

                    /**
                     * Obtém o valor da propriedade infCpl.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInfCpl() {
                        return infCpl;
                    }

                    /**
                     * Define o valor da propriedade infCpl.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInfCpl(String value) {
                        this.infCpl = value;
                    }

                    /**
                     * Gets the value of the obsFisco property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the obsFisco property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getObsFisco().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EnvCFe.LoteCFe.CFe.InfCFe.InfAdic.ObsFisco }
                     * 
                     * 
                     */
                    public List<EnvCFe.LoteCFe.CFe.InfCFe.InfAdic.ObsFisco> getObsFisco() {
                        if (obsFisco == null) {
                            obsFisco = new ArrayList<EnvCFe.LoteCFe.CFe.InfCFe.InfAdic.ObsFisco>();
                        }
                        return this.obsFisco;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="xTexto">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;minLength value="1"/>
                     *               &lt;maxLength value="60"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="xCampo" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="20"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "xTexto"
                    })
                    public static class ObsFisco {

                        @XmlElement(required = true)
                        protected String xTexto;
                        @XmlAttribute(name = "xCampo", required = true)
                        protected String xCampo;

                        /**
                         * Obtém o valor da propriedade xTexto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXTexto() {
                            return xTexto;
                        }

                        /**
                         * Define o valor da propriedade xTexto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXTexto(String value) {
                            this.xTexto = value;
                        }

                        /**
                         * Obtém o valor da propriedade xCampo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXCampo() {
                            return xCampo;
                        }

                        /**
                         * Define o valor da propriedade xCampo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXCampo(String value) {
                            this.xCampo = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="MP" maxOccurs="10">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cMP">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vMP">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="cAdmC" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{3}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="vTroco">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "mp",
                    "vTroco"
                })
                public static class Pgto {

                    @XmlElement(name = "MP", required = true)
                    protected List<EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP> mp;
                    @XmlElement(required = true)
                    protected String vTroco;

                    /**
                     * Gets the value of the mp property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the mp property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMP().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP }
                     * 
                     * 
                     */
                    public List<EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP> getMP() {
                        if (mp == null) {
                            mp = new ArrayList<EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP>();
                        }
                        return this.mp;
                    }

                    /**
                     * Obtém o valor da propriedade vTroco.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVTroco() {
                        return vTroco;
                    }

                    /**
                     * Define o valor da propriedade vTroco.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVTroco(String value) {
                        this.vTroco = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cMP">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vMP">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="cAdmC" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{3}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cmp",
                        "vmp",
                        "cAdmC"
                    })
                    public static class MP {

                        @XmlElement(name = "cMP", required = true)
                        protected String cmp;
                        @XmlElement(name = "vMP", required = true)
                        protected String vmp;
                        protected String cAdmC;

                        /**
                         * Obtém o valor da propriedade cmp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCMP() {
                            return cmp;
                        }

                        /**
                         * Define o valor da propriedade cmp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCMP(String value) {
                            this.cmp = value;
                        }

                        /**
                         * Obtém o valor da propriedade vmp.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVMP() {
                            return vmp;
                        }

                        /**
                         * Define o valor da propriedade vmp.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVMP(String value) {
                            this.vmp = value;
                        }

                        /**
                         * Obtém o valor da propriedade cAdmC.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCAdmC() {
                            return cAdmC;
                        }

                        /**
                         * Define o valor da propriedade cAdmC.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCAdmC(String value) {
                            this.cAdmC = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ICMSTot" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="vICMS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vProd">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vDesc">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vPIS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vCOFINS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vPISST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vCOFINSST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vOutro">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="vCFe">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ISSQNtot" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="vBC">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vISS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vPIS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vCOFINS">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vPISST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vCOFINSST">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DescAcrEntr" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="vDescSubtot" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="vAcresSubtot" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/choice>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="vCFeLei12741" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "icmsTot",
                    "vcFe",
                    "issqNtot",
                    "descAcrEntr",
                    "vcFeLei12741"
                })
                public static class Total {

                    @XmlElement(name = "ICMSTot")
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Total.ICMSTot icmsTot;
                    @XmlElement(name = "vCFe", required = true)
                    protected String vcFe;
                    @XmlElement(name = "ISSQNtot")
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Total.ISSQNtot issqNtot;
                    @XmlElement(name = "DescAcrEntr")
                    protected EnvCFe.LoteCFe.CFe.InfCFe.Total.DescAcrEntr descAcrEntr;
                    @XmlElement(name = "vCFeLei12741")
                    protected String vcFeLei12741;

                    /**
                     * Obtém o valor da propriedade icmsTot.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.ICMSTot }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Total.ICMSTot getICMSTot() {
                        return icmsTot;
                    }

                    /**
                     * Define o valor da propriedade icmsTot.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.ICMSTot }
                     *     
                     */
                    public void setICMSTot(EnvCFe.LoteCFe.CFe.InfCFe.Total.ICMSTot value) {
                        this.icmsTot = value;
                    }

                    /**
                     * Obtém o valor da propriedade vcFe.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVCFe() {
                        return vcFe;
                    }

                    /**
                     * Define o valor da propriedade vcFe.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVCFe(String value) {
                        this.vcFe = value;
                    }

                    /**
                     * Obtém o valor da propriedade issqNtot.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.ISSQNtot }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Total.ISSQNtot getISSQNtot() {
                        return issqNtot;
                    }

                    /**
                     * Define o valor da propriedade issqNtot.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.ISSQNtot }
                     *     
                     */
                    public void setISSQNtot(EnvCFe.LoteCFe.CFe.InfCFe.Total.ISSQNtot value) {
                        this.issqNtot = value;
                    }

                    /**
                     * Obtém o valor da propriedade descAcrEntr.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.DescAcrEntr }
                     *     
                     */
                    public EnvCFe.LoteCFe.CFe.InfCFe.Total.DescAcrEntr getDescAcrEntr() {
                        return descAcrEntr;
                    }

                    /**
                     * Define o valor da propriedade descAcrEntr.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EnvCFe.LoteCFe.CFe.InfCFe.Total.DescAcrEntr }
                     *     
                     */
                    public void setDescAcrEntr(EnvCFe.LoteCFe.CFe.InfCFe.Total.DescAcrEntr value) {
                        this.descAcrEntr = value;
                    }

                    /**
                     * Obtém o valor da propriedade vcFeLei12741.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVCFeLei12741() {
                        return vcFeLei12741;
                    }

                    /**
                     * Define o valor da propriedade vcFeLei12741.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVCFeLei12741(String value) {
                        this.vcFeLei12741 = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;choice>
                     *         &lt;element name="vDescSubtot" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vAcresSubtot" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/choice>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vDescSubtot",
                        "vAcresSubtot"
                    })
                    public static class DescAcrEntr {

                        protected String vDescSubtot;
                        protected String vAcresSubtot;

                        /**
                         * Obtém o valor da propriedade vDescSubtot.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVDescSubtot() {
                            return vDescSubtot;
                        }

                        /**
                         * Define o valor da propriedade vDescSubtot.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVDescSubtot(String value) {
                            this.vDescSubtot = value;
                        }

                        /**
                         * Obtém o valor da propriedade vAcresSubtot.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVAcresSubtot() {
                            return vAcresSubtot;
                        }

                        /**
                         * Define o valor da propriedade vAcresSubtot.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVAcresSubtot(String value) {
                            this.vAcresSubtot = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="vICMS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vProd">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vDesc">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vPIS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vCOFINS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vPISST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vCOFINSST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vOutro">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vicms",
                        "vProd",
                        "vDesc",
                        "vpis",
                        "vcofins",
                        "vpisst",
                        "vcofinsst",
                        "vOutro"
                    })
                    public static class ICMSTot {

                        @XmlElement(name = "vICMS", required = true)
                        protected String vicms;
                        @XmlElement(required = true)
                        protected String vProd;
                        @XmlElement(required = true)
                        protected String vDesc;
                        @XmlElement(name = "vPIS", required = true)
                        protected String vpis;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected String vcofins;
                        @XmlElement(name = "vPISST", required = true)
                        protected String vpisst;
                        @XmlElement(name = "vCOFINSST", required = true)
                        protected String vcofinsst;
                        @XmlElement(required = true)
                        protected String vOutro;

                        /**
                         * Obtém o valor da propriedade vicms.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVICMS(String value) {
                            this.vicms = value;
                        }

                        /**
                         * Obtém o valor da propriedade vProd.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVProd() {
                            return vProd;
                        }

                        /**
                         * Define o valor da propriedade vProd.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVProd(String value) {
                            this.vProd = value;
                        }

                        /**
                         * Obtém o valor da propriedade vDesc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVDesc() {
                            return vDesc;
                        }

                        /**
                         * Define o valor da propriedade vDesc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVDesc(String value) {
                            this.vDesc = value;
                        }

                        /**
                         * Obtém o valor da propriedade vpis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPIS(String value) {
                            this.vpis = value;
                        }

                        /**
                         * Obtém o valor da propriedade vcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINS(String value) {
                            this.vcofins = value;
                        }

                        /**
                         * Obtém o valor da propriedade vpisst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPISST() {
                            return vpisst;
                        }

                        /**
                         * Define o valor da propriedade vpisst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPISST(String value) {
                            this.vpisst = value;
                        }

                        /**
                         * Obtém o valor da propriedade vcofinsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINSST() {
                            return vcofinsst;
                        }

                        /**
                         * Define o valor da propriedade vcofinsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINSST(String value) {
                            this.vcofinsst = value;
                        }

                        /**
                         * Obtém o valor da propriedade vOutro.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVOutro() {
                            return vOutro;
                        }

                        /**
                         * Define o valor da propriedade vOutro.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVOutro(String value) {
                            this.vOutro = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="vBC">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vISS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vPIS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vCOFINS">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vPISST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="vCOFINSST">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;pattern value="^\d{1,13}[.]{1}[0-9]{2}$"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vbc",
                        "viss",
                        "vpis",
                        "vcofins",
                        "vpisst",
                        "vcofinsst"
                    })
                    public static class ISSQNtot {

                        @XmlElement(name = "vBC", required = true)
                        protected String vbc;
                        @XmlElement(name = "vISS", required = true)
                        protected String viss;
                        @XmlElement(name = "vPIS", required = true)
                        protected String vpis;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected String vcofins;
                        @XmlElement(name = "vPISST", required = true)
                        protected String vpisst;
                        @XmlElement(name = "vCOFINSST", required = true)
                        protected String vcofinsst;

                        /**
                         * Obtém o valor da propriedade vbc.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVBC(String value) {
                            this.vbc = value;
                        }

                        /**
                         * Obtém o valor da propriedade viss.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVISS() {
                            return viss;
                        }

                        /**
                         * Define o valor da propriedade viss.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVISS(String value) {
                            this.viss = value;
                        }

                        /**
                         * Obtém o valor da propriedade vpis.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPIS(String value) {
                            this.vpis = value;
                        }

                        /**
                         * Obtém o valor da propriedade vcofins.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINS(String value) {
                            this.vcofins = value;
                        }

                        /**
                         * Obtém o valor da propriedade vpisst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVPISST() {
                            return vpisst;
                        }

                        /**
                         * Define o valor da propriedade vpisst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVPISST(String value) {
                            this.vpisst = value;
                        }

                        /**
                         * Obtém o valor da propriedade vcofinsst.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVCOFINSST() {
                            return vcofinsst;
                        }

                        /**
                         * Define o valor da propriedade vcofinsst.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVCOFINSST(String value) {
                            this.vcofinsst = value;
                        }

                    }

                }

            }

        }

    }

}
