package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
runtime	TokenNameIdentifier
.	TokenNameDOT
output	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
StringOutputBuffer	TokenNameIdentifier
implements	TokenNameimplements
OutputBuffer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
StringBuffer	TokenNameIdentifier
_buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StringOutputBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
OutputBuffer	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
OutputBuffer	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
s	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
from	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
to	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
from	TokenNameIdentifier
,	TokenNameCOMMA
to	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
OutputBuffer	TokenNameIdentifier
append	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
