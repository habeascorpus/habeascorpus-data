package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
TEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
enum	TokenNameenum
IndexType	TokenNameIdentifier
implements	TokenNameimplements
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
TEnum	TokenNameIdentifier
{	TokenNameLBRACE
KEYS	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
CUSTOM	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
COMPOSITES	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
value	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IndexType	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
IndexType	TokenNameIdentifier
findByValue	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
KEYS	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
CUSTOM	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
COMPOSITES	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE