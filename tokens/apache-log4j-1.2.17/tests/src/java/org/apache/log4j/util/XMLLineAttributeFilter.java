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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
oro	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
perl	TokenNameIdentifier
.	TokenNameDOT
Perl5Util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLLineAttributeFilter	TokenNameIdentifier
implements	TokenNameimplements
Filter	TokenNameIdentifier
{	TokenNameLBRACE
Perl5Util	TokenNameIdentifier
util	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Perl5Util	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
filter	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/line="\d{1,3}"/"	TokenNameStringLiteral
,	TokenNameCOMMA
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
"s/line="\d{1,3}"/line="X"/"	TokenNameStringLiteral
,	TokenNameCOMMA
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/line="?"/"	TokenNameStringLiteral
,	TokenNameCOMMA
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
"s/line="?"/line="X"/"	TokenNameStringLiteral
,	TokenNameCOMMA
in	TokenNameIdentifier
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
