package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TruncateException	TokenNameIdentifier
extends	TokenNameextends
RequestExecutionException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TruncateException	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ExceptionCode	TokenNameIdentifier
.	TokenNameDOT
TRUNCATE_ERROR	TokenNameIdentifier
,	TokenNameCOMMA
"Error during truncate: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TruncateException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ExceptionCode	TokenNameIdentifier
.	TokenNameDOT
TRUNCATE_ERROR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
