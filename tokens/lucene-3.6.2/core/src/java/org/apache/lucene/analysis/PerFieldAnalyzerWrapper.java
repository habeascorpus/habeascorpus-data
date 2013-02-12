package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
PerFieldAnalyzerWrapper	TokenNameIdentifier
extends	TokenNameextends
Analyzer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Analyzer	TokenNameIdentifier
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
>	TokenNameGREATER
analyzerMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
PerFieldAnalyzerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
Analyzer	TokenNameIdentifier
defaultAnalyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
defaultAnalyzer	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PerFieldAnalyzerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
Analyzer	TokenNameIdentifier
defaultAnalyzer	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
>	TokenNameGREATER
fieldAnalyzers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
defaultAnalyzer	TokenNameIdentifier
=	TokenNameEQUAL
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fieldAnalyzers	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
putAll	TokenNameIdentifier
(	TokenNameLPAREN
fieldAnalyzers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
addAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
TokenStream	TokenNameIdentifier
tokenStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
analyzer	TokenNameIdentifier
.	TokenNameDOT
tokenStream	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
TokenStream	TokenNameIdentifier
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
analyzer	TokenNameIdentifier
.	TokenNameDOT
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getPositionIncrementGap	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
analyzer	TokenNameIdentifier
.	TokenNameDOT
getPositionIncrementGap	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getOffsetGap	TokenNameIdentifier
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
analyzerMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
defaultAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
analyzer	TokenNameIdentifier
.	TokenNameDOT
getOffsetGap	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"PerFieldAnalyzerWrapper("	TokenNameStringLiteral
+	TokenNamePLUS
analyzerMap	TokenNameIdentifier
+	TokenNamePLUS
", default="	TokenNameStringLiteral
+	TokenNamePLUS
defaultAnalyzer	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
