package com.company.test.test.test.ss13pusa.generated;

import com.company.test.test.test.ss13pusa.Ss13pusa;
import com.speedment.plugin.extspeeder.runtime.FieldMapper;
import com.speedment.plugin.extspeeder.runtime.servlet.ExtSpeederHttpServlet;
import javax.annotation.Generated;
import static com.speedment.encoder.JsonEncoder.jsonValue;

/**
 * The generated servlet representing an entity (for example, a row) in the
 * Table test.test.test.ss13pusa.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public class GeneratedSs13pusaServlet extends ExtSpeederHttpServlet<Ss13pusa> {
    
    private final static long serialVersionUID = -1401542096;
    public static FieldMapper<Ss13pusa> FIELD_MAPPER = columnName -> {
            switch (columnName) {
                case "RT" : return Ss13pusa.RT;
                case "SERIALNO" : return Ss13pusa.SERIALNO;
                case "SPORDER" : return Ss13pusa.SPORDER;
                case "PUMA" : return Ss13pusa.PUMA;
                case "ST" : return Ss13pusa.ST;
                case "ADJINC" : return Ss13pusa.ADJINC;
                case "PWGTP" : return Ss13pusa.PWGTP;
                case "AGEP" : return Ss13pusa.AGEP;
                case "CIT" : return Ss13pusa.CIT;
                case "CITWP" : return Ss13pusa.CITWP;
                case "COW" : return Ss13pusa.COW;
                case "DDRS" : return Ss13pusa.DDRS;
                case "DEAR" : return Ss13pusa.DEAR;
                case "DEYE" : return Ss13pusa.DEYE;
                case "DOUT" : return Ss13pusa.DOUT;
                case "DPHY" : return Ss13pusa.DPHY;
                case "DRAT" : return Ss13pusa.DRAT;
                case "DRATX" : return Ss13pusa.DRATX;
                case "DREM" : return Ss13pusa.DREM;
                case "ENG" : return Ss13pusa.ENG;
                case "FER" : return Ss13pusa.FER;
                case "GCL" : return Ss13pusa.GCL;
                case "GCM" : return Ss13pusa.GCM;
                case "GCR" : return Ss13pusa.GCR;
                case "HINS1" : return Ss13pusa.HINS1;
                case "HINS2" : return Ss13pusa.HINS2;
                case "HINS3" : return Ss13pusa.HINS3;
                case "HINS4" : return Ss13pusa.HINS4;
                case "HINS5" : return Ss13pusa.HINS5;
                case "HINS6" : return Ss13pusa.HINS6;
                case "HINS7" : return Ss13pusa.HINS7;
                case "INTP" : return Ss13pusa.INTP;
                case "JWMNP" : return Ss13pusa.JWMNP;
                case "JWRIP" : return Ss13pusa.JWRIP;
                case "JWTR" : return Ss13pusa.JWTR;
                case "LANX" : return Ss13pusa.LANX;
                case "MAR" : return Ss13pusa.MAR;
                case "MARHD" : return Ss13pusa.MARHD;
                case "MARHM" : return Ss13pusa.MARHM;
                case "MARHT" : return Ss13pusa.MARHT;
                case "MARHW" : return Ss13pusa.MARHW;
                case "MARHYP" : return Ss13pusa.MARHYP;
                case "MIG" : return Ss13pusa.MIG;
                case "MIL" : return Ss13pusa.MIL;
                case "MLPA" : return Ss13pusa.MLPA;
                case "MLPB" : return Ss13pusa.MLPB;
                case "MLPCD" : return Ss13pusa.MLPCD;
                case "MLPE" : return Ss13pusa.MLPE;
                case "MLPFG" : return Ss13pusa.MLPFG;
                case "MLPH" : return Ss13pusa.MLPH;
                case "MLPI" : return Ss13pusa.MLPI;
                case "MLPJ" : return Ss13pusa.MLPJ;
                case "MLPK" : return Ss13pusa.MLPK;
                case "NWAB" : return Ss13pusa.NWAB;
                case "NWAV" : return Ss13pusa.NWAV;
                case "NWLA" : return Ss13pusa.NWLA;
                case "NWLK" : return Ss13pusa.NWLK;
                case "NWRE" : return Ss13pusa.NWRE;
                case "OIP" : return Ss13pusa.OIP;
                case "PAP" : return Ss13pusa.PAP;
                case "RELP" : return Ss13pusa.RELP;
                case "RETP" : return Ss13pusa.RETP;
                case "SCH" : return Ss13pusa.SCH;
                case "SCHG" : return Ss13pusa.SCHG;
                case "SCHL" : return Ss13pusa.SCHL;
                case "SEMP" : return Ss13pusa.SEMP;
                case "SEX" : return Ss13pusa.SEX;
                case "SSIP" : return Ss13pusa.SSIP;
                case "SSP" : return Ss13pusa.SSP;
                case "WAGP" : return Ss13pusa.WAGP;
                case "WKHP" : return Ss13pusa.WKHP;
                case "WKL" : return Ss13pusa.WKL;
                case "WKW" : return Ss13pusa.WKW;
                case "WRK" : return Ss13pusa.WRK;
                case "YOEP" : return Ss13pusa.YOEP;
                case "ANC" : return Ss13pusa.ANC;
                case "ANC1P" : return Ss13pusa.ANC1_P;
                case "ANC2P" : return Ss13pusa.ANC2_P;
                case "DECADE" : return Ss13pusa.DECADE;
                case "DIS" : return Ss13pusa.DIS;
                case "DRIVESP" : return Ss13pusa.DRIVESP;
                case "ESP" : return Ss13pusa.ESP;
                case "ESR" : return Ss13pusa.ESR;
                case "FOD1P" : return Ss13pusa.FOD1_P;
                case "FOD2P" : return Ss13pusa.FOD2_P;
                case "HICOV" : return Ss13pusa.HICOV;
                case "HISP" : return Ss13pusa.HISP;
                case "INDP" : return Ss13pusa.INDP;
                case "JWAP" : return Ss13pusa.JWAP;
                case "JWDP" : return Ss13pusa.JWDP;
                case "LANP" : return Ss13pusa.LANP;
                case "MIGPUMA" : return Ss13pusa.MIGPUMA;
                case "MIGSP" : return Ss13pusa.MIGSP;
                case "MSP" : return Ss13pusa.MSP;
                case "NAICSP" : return Ss13pusa.NAICSP;
                case "NATIVITY" : return Ss13pusa.NATIVITY;
                case "NOP" : return Ss13pusa.NOP;
                case "OC" : return Ss13pusa.OC;
                case "OCCP" : return Ss13pusa.OCCP;
                case "PAOC" : return Ss13pusa.PAOC;
                case "PERNP" : return Ss13pusa.PERNP;
                case "PINCP" : return Ss13pusa.PINCP;
                case "POBP" : return Ss13pusa.POBP;
                case "POVPIP" : return Ss13pusa.POVPIP;
                case "POWPUMA" : return Ss13pusa.POWPUMA;
                case "POWSP" : return Ss13pusa.POWSP;
                case "PRIVCOV" : return Ss13pusa.PRIVCOV;
                case "PUBCOV" : return Ss13pusa.PUBCOV;
                case "QTRBIR" : return Ss13pusa.QTRBIR;
                case "RAC1P" : return Ss13pusa.RAC1_P;
                case "RAC2P" : return Ss13pusa.RAC2_P;
                case "RAC3P" : return Ss13pusa.RAC3_P;
                case "RACAIAN" : return Ss13pusa.RACAIAN;
                case "RACASN" : return Ss13pusa.RACASN;
                case "RACBLK" : return Ss13pusa.RACBLK;
                case "RACNH" : return Ss13pusa.RACNH;
                case "RACNUM" : return Ss13pusa.RACNUM;
                case "RACPI" : return Ss13pusa.RACPI;
                case "RACSOR" : return Ss13pusa.RACSOR;
                case "RACWHT" : return Ss13pusa.RACWHT;
                case "RC" : return Ss13pusa.RC;
                case "SCIENGP" : return Ss13pusa.SCIENGP;
                case "SCIENGRLP" : return Ss13pusa.SCIENGRLP;
                case "SFN" : return Ss13pusa.SFN;
                case "SFR" : return Ss13pusa.SFR;
                case "SOCP" : return Ss13pusa.SOCP;
                case "VPS" : return Ss13pusa.VPS;
                case "WAOB" : return Ss13pusa.WAOB;
                case "FAGEP" : return Ss13pusa.FAGEP;
                case "FANCP" : return Ss13pusa.FANCP;
                case "FCITP" : return Ss13pusa.FCITP;
                case "FCITWP" : return Ss13pusa.FCITWP;
                case "FCOWP" : return Ss13pusa.FCOWP;
                case "FDDRSP" : return Ss13pusa.FDDRSP;
                case "FDEARP" : return Ss13pusa.FDEARP;
                case "FDEYEP" : return Ss13pusa.FDEYEP;
                case "FDISP" : return Ss13pusa.FDISP;
                case "FDOUTP" : return Ss13pusa.FDOUTP;
                case "FDPHYP" : return Ss13pusa.FDPHYP;
                case "FDRATP" : return Ss13pusa.FDRATP;
                case "FDRATXP" : return Ss13pusa.FDRATXP;
                case "FDREMP" : return Ss13pusa.FDREMP;
                case "FENGP" : return Ss13pusa.FENGP;
                case "FESRP" : return Ss13pusa.FESRP;
                case "FFERP" : return Ss13pusa.FFERP;
                case "FFODP" : return Ss13pusa.FFODP;
                case "FGCLP" : return Ss13pusa.FGCLP;
                case "FGCMP" : return Ss13pusa.FGCMP;
                case "FGCRP" : return Ss13pusa.FGCRP;
                case "FHINS1P" : return Ss13pusa.FHINS1_P;
                case "FHINS2P" : return Ss13pusa.FHINS2_P;
                case "FHINS3C" : return Ss13pusa.FHINS3_C;
                case "FHINS3P" : return Ss13pusa.FHINS3_P;
                case "FHINS4C" : return Ss13pusa.FHINS4_C;
                case "FHINS4P" : return Ss13pusa.FHINS4_P;
                case "FHINS5C" : return Ss13pusa.FHINS5_C;
                case "FHINS5P" : return Ss13pusa.FHINS5_P;
                case "FHINS6P" : return Ss13pusa.FHINS6_P;
                case "FHINS7P" : return Ss13pusa.FHINS7_P;
                case "FHISP" : return Ss13pusa.FHISP;
                case "FINDP" : return Ss13pusa.FINDP;
                case "FINTP" : return Ss13pusa.FINTP;
                case "FJWDP" : return Ss13pusa.FJWDP;
                case "FJWMNP" : return Ss13pusa.FJWMNP;
                case "FJWRIP" : return Ss13pusa.FJWRIP;
                case "FJWTRP" : return Ss13pusa.FJWTRP;
                case "FLANP" : return Ss13pusa.FLANP;
                case "FLANXP" : return Ss13pusa.FLANXP;
                case "FMARHDP" : return Ss13pusa.FMARHDP;
                case "FMARHMP" : return Ss13pusa.FMARHMP;
                case "FMARHTP" : return Ss13pusa.FMARHTP;
                case "FMARHWP" : return Ss13pusa.FMARHWP;
                case "FMARHYP" : return Ss13pusa.FMARHYP;
                case "FMARP" : return Ss13pusa.FMARP;
                case "FMIGP" : return Ss13pusa.FMIGP;
                case "FMIGSP" : return Ss13pusa.FMIGSP;
                case "FMILPP" : return Ss13pusa.FMILPP;
                case "FMILSP" : return Ss13pusa.FMILSP;
                case "FOCCP" : return Ss13pusa.FOCCP;
                case "FOIP" : return Ss13pusa.FOIP;
                case "FPAP" : return Ss13pusa.FPAP;
                case "FPERNP" : return Ss13pusa.FPERNP;
                case "FPINCP" : return Ss13pusa.FPINCP;
                case "FPOBP" : return Ss13pusa.FPOBP;
                case "FPOWSP" : return Ss13pusa.FPOWSP;
                case "FPRIVCOVP" : return Ss13pusa.FPRIVCOVP;
                case "FPUBCOVP" : return Ss13pusa.FPUBCOVP;
                case "FRACP" : return Ss13pusa.FRACP;
                case "FRELP" : return Ss13pusa.FRELP;
                case "FRETP" : return Ss13pusa.FRETP;
                case "FSCHGP" : return Ss13pusa.FSCHGP;
                case "FSCHLP" : return Ss13pusa.FSCHLP;
                case "FSCHP" : return Ss13pusa.FSCHP;
                case "FSEMP" : return Ss13pusa.FSEMP;
                case "FSEXP" : return Ss13pusa.FSEXP;
                case "FSSIP" : return Ss13pusa.FSSIP;
                case "FSSP" : return Ss13pusa.FSSP;
                case "FWAGP" : return Ss13pusa.FWAGP;
                case "FWKHP" : return Ss13pusa.FWKHP;
                case "FWKLP" : return Ss13pusa.FWKLP;
                case "FWKWP" : return Ss13pusa.FWKWP;
                case "FWRKP" : return Ss13pusa.FWRKP;
                case "FYOEP" : return Ss13pusa.FYOEP;
                default : return null;
            }
    };
    
    @Override
    public Class<Ss13pusa> entityClass() {
        return Ss13pusa.class;
    }
    
    @Override
    public FieldMapper<Ss13pusa> fieldMapper() {
        return FIELD_MAPPER;
    }
    
    @Override
    public String toJson(Ss13pusa entity) {
        return entity == null ? "null" : new StringBuilder()
            .append('{')
            .append("\"RT\":").append(jsonValue(entity.getRt())).append(", ")
            .append("\"SERIALNO\":").append(jsonValue(entity.getSerialno())).append(", ")
            .append("\"SPORDER\":").append(jsonValue(entity.getSporder())).append(", ")
            .append("\"PUMA\":").append(jsonValue(entity.getPuma())).append(", ")
            .append("\"ST\":").append(jsonValue(entity.getSt())).append(", ")
            .append("\"ADJINC\":").append(jsonValue(entity.getAdjinc())).append(", ")
            .append("\"PWGTP\":").append(jsonValue(entity.getPwgtp())).append(", ")
            .append("\"AGEP\":").append(jsonValue(entity.getAgep())).append(", ")
            .append("\"CIT\":").append(jsonValue(entity.getCit())).append(", ")
            .append("\"CITWP\":").append(jsonValue(entity.getCitwp())).append(", ")
            .append("\"COW\":").append(jsonValue(entity.getCow())).append(", ")
            .append("\"DDRS\":").append(jsonValue(entity.getDdrs())).append(", ")
            .append("\"DEAR\":").append(jsonValue(entity.getDear())).append(", ")
            .append("\"DEYE\":").append(jsonValue(entity.getDeye())).append(", ")
            .append("\"DOUT\":").append(jsonValue(entity.getDout())).append(", ")
            .append("\"DPHY\":").append(jsonValue(entity.getDphy())).append(", ")
            .append("\"DRAT\":").append(jsonValue(entity.getDrat())).append(", ")
            .append("\"DRATX\":").append(jsonValue(entity.getDratx())).append(", ")
            .append("\"DREM\":").append(jsonValue(entity.getDrem())).append(", ")
            .append("\"ENG\":").append(jsonValue(entity.getEng())).append(", ")
            .append("\"FER\":").append(jsonValue(entity.getFer())).append(", ")
            .append("\"GCL\":").append(jsonValue(entity.getGcl())).append(", ")
            .append("\"GCM\":").append(jsonValue(entity.getGcm())).append(", ")
            .append("\"GCR\":").append(jsonValue(entity.getGcr())).append(", ")
            .append("\"HINS1\":").append(jsonValue(entity.getHins1())).append(", ")
            .append("\"HINS2\":").append(jsonValue(entity.getHins2())).append(", ")
            .append("\"HINS3\":").append(jsonValue(entity.getHins3())).append(", ")
            .append("\"HINS4\":").append(jsonValue(entity.getHins4())).append(", ")
            .append("\"HINS5\":").append(jsonValue(entity.getHins5())).append(", ")
            .append("\"HINS6\":").append(jsonValue(entity.getHins6())).append(", ")
            .append("\"HINS7\":").append(jsonValue(entity.getHins7())).append(", ")
            .append("\"INTP\":").append(jsonValue(entity.getIntp())).append(", ")
            .append("\"JWMNP\":").append(jsonValue(entity.getJwmnp())).append(", ")
            .append("\"JWRIP\":").append(jsonValue(entity.getJwrip())).append(", ")
            .append("\"JWTR\":").append(jsonValue(entity.getJwtr())).append(", ")
            .append("\"LANX\":").append(jsonValue(entity.getLanx())).append(", ")
            .append("\"MAR\":").append(jsonValue(entity.getMar())).append(", ")
            .append("\"MARHD\":").append(jsonValue(entity.getMarhd())).append(", ")
            .append("\"MARHM\":").append(jsonValue(entity.getMarhm())).append(", ")
            .append("\"MARHT\":").append(jsonValue(entity.getMarht())).append(", ")
            .append("\"MARHW\":").append(jsonValue(entity.getMarhw())).append(", ")
            .append("\"MARHYP\":").append(jsonValue(entity.getMarhyp())).append(", ")
            .append("\"MIG\":").append(jsonValue(entity.getMig())).append(", ")
            .append("\"MIL\":").append(jsonValue(entity.getMil())).append(", ")
            .append("\"MLPA\":").append(jsonValue(entity.getMlpa())).append(", ")
            .append("\"MLPB\":").append(jsonValue(entity.getMlpb())).append(", ")
            .append("\"MLPCD\":").append(jsonValue(entity.getMlpcd())).append(", ")
            .append("\"MLPE\":").append(jsonValue(entity.getMlpe())).append(", ")
            .append("\"MLPFG\":").append(jsonValue(entity.getMlpfg())).append(", ")
            .append("\"MLPH\":").append(jsonValue(entity.getMlph())).append(", ")
            .append("\"MLPI\":").append(jsonValue(entity.getMlpi())).append(", ")
            .append("\"MLPJ\":").append(jsonValue(entity.getMlpj())).append(", ")
            .append("\"MLPK\":").append(jsonValue(entity.getMlpk())).append(", ")
            .append("\"NWAB\":").append(jsonValue(entity.getNwab())).append(", ")
            .append("\"NWAV\":").append(jsonValue(entity.getNwav())).append(", ")
            .append("\"NWLA\":").append(jsonValue(entity.getNwla())).append(", ")
            .append("\"NWLK\":").append(jsonValue(entity.getNwlk())).append(", ")
            .append("\"NWRE\":").append(jsonValue(entity.getNwre())).append(", ")
            .append("\"OIP\":").append(jsonValue(entity.getOip())).append(", ")
            .append("\"PAP\":").append(jsonValue(entity.getPap())).append(", ")
            .append("\"RELP\":").append(jsonValue(entity.getRelp())).append(", ")
            .append("\"RETP\":").append(jsonValue(entity.getRetp())).append(", ")
            .append("\"SCH\":").append(jsonValue(entity.getSch())).append(", ")
            .append("\"SCHG\":").append(jsonValue(entity.getSchg())).append(", ")
            .append("\"SCHL\":").append(jsonValue(entity.getSchl())).append(", ")
            .append("\"SEMP\":").append(jsonValue(entity.getSemp())).append(", ")
            .append("\"SEX\":").append(jsonValue(entity.getSex())).append(", ")
            .append("\"SSIP\":").append(jsonValue(entity.getSsip())).append(", ")
            .append("\"SSP\":").append(jsonValue(entity.getSsp())).append(", ")
            .append("\"WAGP\":").append(jsonValue(entity.getWagp())).append(", ")
            .append("\"WKHP\":").append(jsonValue(entity.getWkhp())).append(", ")
            .append("\"WKL\":").append(jsonValue(entity.getWkl())).append(", ")
            .append("\"WKW\":").append(jsonValue(entity.getWkw())).append(", ")
            .append("\"WRK\":").append(jsonValue(entity.getWrk())).append(", ")
            .append("\"YOEP\":").append(jsonValue(entity.getYoep())).append(", ")
            .append("\"ANC\":").append(jsonValue(entity.getAnc())).append(", ")
            .append("\"ANC1P\":").append(jsonValue(entity.getAnc1P())).append(", ")
            .append("\"ANC2P\":").append(jsonValue(entity.getAnc2P())).append(", ")
            .append("\"DECADE\":").append(jsonValue(entity.getDecade())).append(", ")
            .append("\"DIS\":").append(jsonValue(entity.getDis())).append(", ")
            .append("\"DRIVESP\":").append(jsonValue(entity.getDrivesp())).append(", ")
            .append("\"ESP\":").append(jsonValue(entity.getEsp())).append(", ")
            .append("\"ESR\":").append(jsonValue(entity.getEsr())).append(", ")
            .append("\"FOD1P\":").append(jsonValue(entity.getFod1P())).append(", ")
            .append("\"FOD2P\":").append(jsonValue(entity.getFod2P())).append(", ")
            .append("\"HICOV\":").append(jsonValue(entity.getHicov())).append(", ")
            .append("\"HISP\":").append(jsonValue(entity.getHisp())).append(", ")
            .append("\"INDP\":").append(jsonValue(entity.getIndp())).append(", ")
            .append("\"JWAP\":").append(jsonValue(entity.getJwap())).append(", ")
            .append("\"JWDP\":").append(jsonValue(entity.getJwdp())).append(", ")
            .append("\"LANP\":").append(jsonValue(entity.getLanp())).append(", ")
            .append("\"MIGPUMA\":").append(jsonValue(entity.getMigpuma())).append(", ")
            .append("\"MIGSP\":").append(jsonValue(entity.getMigsp())).append(", ")
            .append("\"MSP\":").append(jsonValue(entity.getMsp())).append(", ")
            .append("\"NAICSP\":").append(jsonValue(entity.getNaicsp())).append(", ")
            .append("\"NATIVITY\":").append(jsonValue(entity.getNativity())).append(", ")
            .append("\"NOP\":").append(jsonValue(entity.getNop())).append(", ")
            .append("\"OC\":").append(jsonValue(entity.getOc())).append(", ")
            .append("\"OCCP\":").append(jsonValue(entity.getOccp())).append(", ")
            .append("\"PAOC\":").append(jsonValue(entity.getPaoc())).append(", ")
            .append("\"PERNP\":").append(jsonValue(entity.getPernp())).append(", ")
            .append("\"PINCP\":").append(jsonValue(entity.getPincp())).append(", ")
            .append("\"POBP\":").append(jsonValue(entity.getPobp())).append(", ")
            .append("\"POVPIP\":").append(jsonValue(entity.getPovpip())).append(", ")
            .append("\"POWPUMA\":").append(jsonValue(entity.getPowpuma())).append(", ")
            .append("\"POWSP\":").append(jsonValue(entity.getPowsp())).append(", ")
            .append("\"PRIVCOV\":").append(jsonValue(entity.getPrivcov())).append(", ")
            .append("\"PUBCOV\":").append(jsonValue(entity.getPubcov())).append(", ")
            .append("\"QTRBIR\":").append(jsonValue(entity.getQtrbir())).append(", ")
            .append("\"RAC1P\":").append(jsonValue(entity.getRac1P())).append(", ")
            .append("\"RAC2P\":").append(jsonValue(entity.getRac2P())).append(", ")
            .append("\"RAC3P\":").append(jsonValue(entity.getRac3P())).append(", ")
            .append("\"RACAIAN\":").append(jsonValue(entity.getRacaian())).append(", ")
            .append("\"RACASN\":").append(jsonValue(entity.getRacasn())).append(", ")
            .append("\"RACBLK\":").append(jsonValue(entity.getRacblk())).append(", ")
            .append("\"RACNH\":").append(jsonValue(entity.getRacnh())).append(", ")
            .append("\"RACNUM\":").append(jsonValue(entity.getRacnum())).append(", ")
            .append("\"RACPI\":").append(jsonValue(entity.getRacpi())).append(", ")
            .append("\"RACSOR\":").append(jsonValue(entity.getRacsor())).append(", ")
            .append("\"RACWHT\":").append(jsonValue(entity.getRacwht())).append(", ")
            .append("\"RC\":").append(jsonValue(entity.getRc())).append(", ")
            .append("\"SCIENGP\":").append(jsonValue(entity.getSciengp())).append(", ")
            .append("\"SCIENGRLP\":").append(jsonValue(entity.getSciengrlp())).append(", ")
            .append("\"SFN\":").append(jsonValue(entity.getSfn())).append(", ")
            .append("\"SFR\":").append(jsonValue(entity.getSfr())).append(", ")
            .append("\"SOCP\":").append(jsonValue(entity.getSocp())).append(", ")
            .append("\"VPS\":").append(jsonValue(entity.getVps())).append(", ")
            .append("\"WAOB\":").append(jsonValue(entity.getWaob())).append(", ")
            .append("\"FAGEP\":").append(jsonValue(entity.getFagep())).append(", ")
            .append("\"FANCP\":").append(jsonValue(entity.getFancp())).append(", ")
            .append("\"FCITP\":").append(jsonValue(entity.getFcitp())).append(", ")
            .append("\"FCITWP\":").append(jsonValue(entity.getFcitwp())).append(", ")
            .append("\"FCOWP\":").append(jsonValue(entity.getFcowp())).append(", ")
            .append("\"FDDRSP\":").append(jsonValue(entity.getFddrsp())).append(", ")
            .append("\"FDEARP\":").append(jsonValue(entity.getFdearp())).append(", ")
            .append("\"FDEYEP\":").append(jsonValue(entity.getFdeyep())).append(", ")
            .append("\"FDISP\":").append(jsonValue(entity.getFdisp())).append(", ")
            .append("\"FDOUTP\":").append(jsonValue(entity.getFdoutp())).append(", ")
            .append("\"FDPHYP\":").append(jsonValue(entity.getFdphyp())).append(", ")
            .append("\"FDRATP\":").append(jsonValue(entity.getFdratp())).append(", ")
            .append("\"FDRATXP\":").append(jsonValue(entity.getFdratxp())).append(", ")
            .append("\"FDREMP\":").append(jsonValue(entity.getFdremp())).append(", ")
            .append("\"FENGP\":").append(jsonValue(entity.getFengp())).append(", ")
            .append("\"FESRP\":").append(jsonValue(entity.getFesrp())).append(", ")
            .append("\"FFERP\":").append(jsonValue(entity.getFferp())).append(", ")
            .append("\"FFODP\":").append(jsonValue(entity.getFfodp())).append(", ")
            .append("\"FGCLP\":").append(jsonValue(entity.getFgclp())).append(", ")
            .append("\"FGCMP\":").append(jsonValue(entity.getFgcmp())).append(", ")
            .append("\"FGCRP\":").append(jsonValue(entity.getFgcrp())).append(", ")
            .append("\"FHINS1P\":").append(jsonValue(entity.getFhins1P())).append(", ")
            .append("\"FHINS2P\":").append(jsonValue(entity.getFhins2P())).append(", ")
            .append("\"FHINS3C\":").append(jsonValue(entity.getFhins3C())).append(", ")
            .append("\"FHINS3P\":").append(jsonValue(entity.getFhins3P())).append(", ")
            .append("\"FHINS4C\":").append(jsonValue(entity.getFhins4C())).append(", ")
            .append("\"FHINS4P\":").append(jsonValue(entity.getFhins4P())).append(", ")
            .append("\"FHINS5C\":").append(jsonValue(entity.getFhins5C())).append(", ")
            .append("\"FHINS5P\":").append(jsonValue(entity.getFhins5P())).append(", ")
            .append("\"FHINS6P\":").append(jsonValue(entity.getFhins6P())).append(", ")
            .append("\"FHINS7P\":").append(jsonValue(entity.getFhins7P())).append(", ")
            .append("\"FHISP\":").append(jsonValue(entity.getFhisp())).append(", ")
            .append("\"FINDP\":").append(jsonValue(entity.getFindp())).append(", ")
            .append("\"FINTP\":").append(jsonValue(entity.getFintp())).append(", ")
            .append("\"FJWDP\":").append(jsonValue(entity.getFjwdp())).append(", ")
            .append("\"FJWMNP\":").append(jsonValue(entity.getFjwmnp())).append(", ")
            .append("\"FJWRIP\":").append(jsonValue(entity.getFjwrip())).append(", ")
            .append("\"FJWTRP\":").append(jsonValue(entity.getFjwtrp())).append(", ")
            .append("\"FLANP\":").append(jsonValue(entity.getFlanp())).append(", ")
            .append("\"FLANXP\":").append(jsonValue(entity.getFlanxp())).append(", ")
            .append("\"FMARHDP\":").append(jsonValue(entity.getFmarhdp())).append(", ")
            .append("\"FMARHMP\":").append(jsonValue(entity.getFmarhmp())).append(", ")
            .append("\"FMARHTP\":").append(jsonValue(entity.getFmarhtp())).append(", ")
            .append("\"FMARHWP\":").append(jsonValue(entity.getFmarhwp())).append(", ")
            .append("\"FMARHYP\":").append(jsonValue(entity.getFmarhyp())).append(", ")
            .append("\"FMARP\":").append(jsonValue(entity.getFmarp())).append(", ")
            .append("\"FMIGP\":").append(jsonValue(entity.getFmigp())).append(", ")
            .append("\"FMIGSP\":").append(jsonValue(entity.getFmigsp())).append(", ")
            .append("\"FMILPP\":").append(jsonValue(entity.getFmilpp())).append(", ")
            .append("\"FMILSP\":").append(jsonValue(entity.getFmilsp())).append(", ")
            .append("\"FOCCP\":").append(jsonValue(entity.getFoccp())).append(", ")
            .append("\"FOIP\":").append(jsonValue(entity.getFoip())).append(", ")
            .append("\"FPAP\":").append(jsonValue(entity.getFpap())).append(", ")
            .append("\"FPERNP\":").append(jsonValue(entity.getFpernp())).append(", ")
            .append("\"FPINCP\":").append(jsonValue(entity.getFpincp())).append(", ")
            .append("\"FPOBP\":").append(jsonValue(entity.getFpobp())).append(", ")
            .append("\"FPOWSP\":").append(jsonValue(entity.getFpowsp())).append(", ")
            .append("\"FPRIVCOVP\":").append(jsonValue(entity.getFprivcovp())).append(", ")
            .append("\"FPUBCOVP\":").append(jsonValue(entity.getFpubcovp())).append(", ")
            .append("\"FRACP\":").append(jsonValue(entity.getFracp())).append(", ")
            .append("\"FRELP\":").append(jsonValue(entity.getFrelp())).append(", ")
            .append("\"FRETP\":").append(jsonValue(entity.getFretp())).append(", ")
            .append("\"FSCHGP\":").append(jsonValue(entity.getFschgp())).append(", ")
            .append("\"FSCHLP\":").append(jsonValue(entity.getFschlp())).append(", ")
            .append("\"FSCHP\":").append(jsonValue(entity.getFschp())).append(", ")
            .append("\"FSEMP\":").append(jsonValue(entity.getFsemp())).append(", ")
            .append("\"FSEXP\":").append(jsonValue(entity.getFsexp())).append(", ")
            .append("\"FSSIP\":").append(jsonValue(entity.getFssip())).append(", ")
            .append("\"FSSP\":").append(jsonValue(entity.getFssp())).append(", ")
            .append("\"FWAGP\":").append(jsonValue(entity.getFwagp())).append(", ")
            .append("\"FWKHP\":").append(jsonValue(entity.getFwkhp())).append(", ")
            .append("\"FWKLP\":").append(jsonValue(entity.getFwklp())).append(", ")
            .append("\"FWKWP\":").append(jsonValue(entity.getFwkwp())).append(", ")
            .append("\"FWRKP\":").append(jsonValue(entity.getFwrkp())).append(", ")
            .append("\"FYOEP\":").append(jsonValue(entity.getFyoep()))
            .append('}')
        .toString();
    }
    
    @Override
    public String getServletInfo() {
        return "Servlet for the ss13pusa table in the test schema.";
    }
}