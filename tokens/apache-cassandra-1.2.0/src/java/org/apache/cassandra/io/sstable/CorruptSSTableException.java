package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
sstable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CorruptSSTableException	TokenNameIdentifier
extends	TokenNameextends
RuntimeException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
File	TokenNameIdentifier
path	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CorruptSSTableException	TokenNameIdentifier
(	TokenNameLPAREN
Exception	TokenNameIdentifier
cause	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
path	TokenNameIdentifier
=	TokenNameEQUAL
path	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CorruptSSTableException	TokenNameIdentifier
(	TokenNameLPAREN
Exception	TokenNameIdentifier
cause	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
cause	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE