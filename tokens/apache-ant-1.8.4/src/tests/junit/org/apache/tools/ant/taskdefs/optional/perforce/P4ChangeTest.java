package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
perforce	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
P4ChangeTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
P4Change	TokenNameIdentifier
p4change	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
P4ChangeTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
p4change	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
P4Change	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBackslash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
"comment with a / inside"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
P4Change	TokenNameIdentifier
.	TokenNameDOT
backslash	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"comment with a \/ inside"	TokenNameStringLiteral
,	TokenNameCOMMA
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSubstitute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Perl5Util	TokenNameIdentifier
util	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Perl5Util	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
tosubstitute	TokenNameIdentifier
=	TokenNameEQUAL
"xx<here>xx"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
P4Change	TokenNameIdentifier
.	TokenNameDOT
backslash	TokenNameIdentifier
(	TokenNameLPAREN
"/a/b/c/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
"s/<here>/"	TokenNameStringLiteral
+	TokenNamePLUS
input	TokenNameIdentifier
+	TokenNamePLUS
"/"	TokenNameStringLiteral
,	TokenNameCOMMA
tosubstitute	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"xx/a/b/c/xx"	TokenNameStringLiteral
,	TokenNameCOMMA
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE