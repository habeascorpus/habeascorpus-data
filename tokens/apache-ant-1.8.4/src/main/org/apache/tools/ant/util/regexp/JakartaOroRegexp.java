package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regexp	TokenNameIdentifier
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
regex	TokenNameIdentifier
.	TokenNameDOT
Perl5Substitution	TokenNameIdentifier
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
regex	TokenNameIdentifier
.	TokenNameDOT
Substitution	TokenNameIdentifier
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
regex	TokenNameIdentifier
.	TokenNameDOT
Util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JakartaOroRegexp	TokenNameIdentifier
extends	TokenNameextends
JakartaOroMatcher	TokenNameIdentifier
implements	TokenNameimplements
Regexp	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DECIMAL	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
JakartaOroRegexp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
substitute	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
argument	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
subst	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
argument	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
c	TokenNameIdentifier
=	TokenNameEQUAL
argument	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'$'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'$'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'\\'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
<	TokenNameLESS
argument	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
argument	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
value	TokenNameIdentifier
=	TokenNameEQUAL
Character	TokenNameIdentifier
.	TokenNameDOT
digit	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
,	TokenNameCOMMA
DECIMAL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
>	TokenNameGREATER
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"$"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
subst	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
Substitution	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Perl5Substitution	TokenNameIdentifier
(	TokenNameLPAREN
subst	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Perl5Substitution	TokenNameIdentifier
.	TokenNameDOT
INTERPOLATE_ALL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
Util	TokenNameIdentifier
.	TokenNameDOT
substitute	TokenNameIdentifier
(	TokenNameLPAREN
matcher	TokenNameIdentifier
,	TokenNameCOMMA
getCompiledPattern	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
input	TokenNameIdentifier
,	TokenNameCOMMA
getSubsOptions	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getSubsOptions	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
options	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
replaceAll	TokenNameIdentifier
=	TokenNameEQUAL
RegexpUtil	TokenNameIdentifier
.	TokenNameDOT
hasFlag	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
REPLACE_ALL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
subsOptions	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
replaceAll	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
subsOptions	TokenNameIdentifier
=	TokenNameEQUAL
Util	TokenNameIdentifier
.	TokenNameDOT
SUBSTITUTE_ALL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
subsOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE