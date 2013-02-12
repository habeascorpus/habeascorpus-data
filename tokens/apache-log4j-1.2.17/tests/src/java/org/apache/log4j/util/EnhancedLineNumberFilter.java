package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EnhancedLineNumberFilter	TokenNameIdentifier
implements	TokenNameimplements
Filter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Pattern	TokenNameIdentifier
linePattern	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Pattern	TokenNameIdentifier
nativePattern	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
EnhancedLineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
linePattern	TokenNameIdentifier
=	TokenNameEQUAL
Pattern	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
"\(.*:\d{1,4}\)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nativePattern	TokenNameIdentifier
=	TokenNameEQUAL
Pattern	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
"\(Native Method\)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
filter	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
linePattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
find	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
linePattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
replaceAll	TokenNameIdentifier
(	TokenNameLPAREN
"(X)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
nativePattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
find	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
nativePattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
replaceAll	TokenNameIdentifier
(	TokenNameLPAREN
"(X)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
in	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
