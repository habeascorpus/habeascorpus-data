package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Relation	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
ColumnIdentifier	TokenNameIdentifier
entity	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Type	TokenNameIdentifier
relationType	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Term	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
inValues	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
boolean	TokenNameboolean
onToken	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
enum	TokenNameenum
Type	TokenNameIdentifier
{	TokenNameLBRACE
EQ	TokenNameIdentifier
,	TokenNameCOMMA
LT	TokenNameIdentifier
,	TokenNameCOMMA
LTE	TokenNameIdentifier
,	TokenNameCOMMA
GTE	TokenNameIdentifier
,	TokenNameCOMMA
GT	TokenNameIdentifier
,	TokenNameCOMMA
IN	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
Type	TokenNameIdentifier
forString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"="	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
EQ	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"<"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
LT	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"<="	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
LTE	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
">="	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
GTE	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
">"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
GT	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Relation	TokenNameIdentifier
(	TokenNameLPAREN
ColumnIdentifier	TokenNameIdentifier
entity	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
inValues	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
onToken	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
entity	TokenNameIdentifier
=	TokenNameEQUAL
entity	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
relationType	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
inValues	TokenNameIdentifier
=	TokenNameEQUAL
inValues	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
onToken	TokenNameIdentifier
=	TokenNameEQUAL
onToken	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Relation	TokenNameIdentifier
(	TokenNameLPAREN
ColumnIdentifier	TokenNameIdentifier
entity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
entity	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
.	TokenNameDOT
forString	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Relation	TokenNameIdentifier
(	TokenNameLPAREN
ColumnIdentifier	TokenNameIdentifier
entity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Term	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
onToken	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
entity	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
.	TokenNameDOT
forString	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
onToken	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Relation	TokenNameIdentifier
createInRelation	TokenNameIdentifier
(	TokenNameLPAREN
ColumnIdentifier	TokenNameIdentifier
entity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Relation	TokenNameIdentifier
(	TokenNameLPAREN
entity	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
.	TokenNameDOT
IN	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Type	TokenNameIdentifier
operator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
relationType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ColumnIdentifier	TokenNameIdentifier
getEntity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
entity	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Term	TokenNameIdentifier
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
relationType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
IN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
getInValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
relationType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
IN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
inValues	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addInValue	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
inValues	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
relationType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
IN	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"%s IN %s"	TokenNameStringLiteral
,	TokenNameCOMMA
entity	TokenNameIdentifier
,	TokenNameCOMMA
inValues	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"%s %s %s"	TokenNameStringLiteral
,	TokenNameCOMMA
entity	TokenNameIdentifier
,	TokenNameCOMMA
relationType	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
