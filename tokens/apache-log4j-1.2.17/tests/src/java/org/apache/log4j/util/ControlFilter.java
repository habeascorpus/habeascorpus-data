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
ControlFilter	TokenNameIdentifier
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
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
allowedPatterns	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ControlFilter	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
allowedPatterns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
allowedPatterns	TokenNameIdentifier
=	TokenNameEQUAL
allowedPatterns	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
filter	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnexpectedFormatException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
allowedPatterns	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
util	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
"/"	TokenNameStringLiteral
+	TokenNamePLUS
allowedPatterns	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
"/"	TokenNameStringLiteral
,	TokenNameCOMMA
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
in	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
UnexpectedFormatException	TokenNameIdentifier
(	TokenNameLPAREN
"["	TokenNameStringLiteral
+	TokenNamePLUS
in	TokenNameIdentifier
+	TokenNamePLUS
"]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE