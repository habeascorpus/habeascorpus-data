package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
.	TokenNameDOT
viewer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
.	TokenNameDOT
DefaultTableModel	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LogTableModel	TokenNameIdentifier
extends	TokenNameextends
DefaultTableModel	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3593300685868700894L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
LogTableModel	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colNames	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numRows	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
colNames	TokenNameIdentifier
,	TokenNameCOMMA
numRows	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCellEditable	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
row	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
column	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
