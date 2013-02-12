package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
highlight	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleHTMLFormatter	TokenNameIdentifier
implements	TokenNameimplements
Formatter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_PRE_TAG	TokenNameIdentifier
=	TokenNameEQUAL
"<B>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_POST_TAG	TokenNameIdentifier
=	TokenNameEQUAL
"</B>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
preTag	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
postTag	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimpleHTMLFormatter	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
preTag	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
postTag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
preTag	TokenNameIdentifier
=	TokenNameEQUAL
preTag	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
postTag	TokenNameIdentifier
=	TokenNameEQUAL
postTag	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SimpleHTMLFormatter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
DEFAULT_PRE_TAG	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_POST_TAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
highlightTerm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
originalText	TokenNameIdentifier
,	TokenNameCOMMA
TokenGroup	TokenNameIdentifier
tokenGroup	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tokenGroup	TokenNameIdentifier
.	TokenNameDOT
getTotalScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
originalText	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringBuilder	TokenNameIdentifier
returnBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
preTag	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
originalText	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
postTag	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
returnBuffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
preTag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
returnBuffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
originalText	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
returnBuffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
postTag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
returnBuffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
