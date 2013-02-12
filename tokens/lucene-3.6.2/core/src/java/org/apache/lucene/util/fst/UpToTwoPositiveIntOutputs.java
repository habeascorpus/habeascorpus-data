package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
fst	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
UpToTwoPositiveIntOutputs	TokenNameIdentifier
extends	TokenNameextends
Outputs	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
class	TokenNameclass
TwoLongs	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
long	TokenNamelong
first	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
long	TokenNamelong
second	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TwoLongs	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
first	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
second	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
first	TokenNameIdentifier
=	TokenNameEQUAL
first	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
second	TokenNameIdentifier
=	TokenNameEQUAL
second	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
first	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
second	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
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
"TwoLongs:"	TokenNameStringLiteral
+	TokenNamePLUS
first	TokenNameIdentifier
+	TokenNamePLUS
","	TokenNameStringLiteral
+	TokenNamePLUS
second	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_other	TokenNameIdentifier
instanceof	TokenNameinstanceof
TwoLongs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
TwoLongs	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TwoLongs	TokenNameIdentifier
)	TokenNameRPAREN
_other	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
first	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
&&	TokenNameAND_AND
second	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
second	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
first	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
first	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
^	TokenNameXOR
(	TokenNameLPAREN
second	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
second	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
Long	TokenNameIdentifier
NO_OUTPUT	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
doShare	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
UpToTwoPositiveIntOutputs	TokenNameIdentifier
singletonShare	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UpToTwoPositiveIntOutputs	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
UpToTwoPositiveIntOutputs	TokenNameIdentifier
singletonNoShare	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UpToTwoPositiveIntOutputs	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
UpToTwoPositiveIntOutputs	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
doShare	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
doShare	TokenNameIdentifier
=	TokenNameEQUAL
doShare	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
UpToTwoPositiveIntOutputs	TokenNameIdentifier
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
doShare	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
doShare	TokenNameIdentifier
?	TokenNameQUESTION
singletonShare	TokenNameIdentifier
:	TokenNameCOLON
singletonNoShare	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Long	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
TwoLongs	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
first	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
second	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TwoLongs	TokenNameIdentifier
(	TokenNameLPAREN
first	TokenNameIdentifier
,	TokenNameCOMMA
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Long	TokenNameIdentifier
common	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_output1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
_output2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_output1	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_output2	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Long	TokenNameIdentifier
output1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_output1	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
Long	TokenNameIdentifier
output2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_output2	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
output1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
||	TokenNameOR_OR
output2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
doShare	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
output1	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
output2	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
output1	TokenNameIdentifier
,	TokenNameCOMMA
output2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
output1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
output2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Long	TokenNameIdentifier
subtract	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_output	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
_inc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_output	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_inc	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Long	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_output	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
Long	TokenNameIdentifier
inc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_inc	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
output	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
inc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
inc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
inc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
-	TokenNameMINUS
inc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
add	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_prefix	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
_output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_prefix	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_output	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Long	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_output	TokenNameIdentifier
instanceof	TokenNameinstanceof
Long	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Long	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_output	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
output	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
prefix	TokenNameIdentifier
+	TokenNamePLUS
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
TwoLongs	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TwoLongs	TokenNameIdentifier
)	TokenNameRPAREN
_output	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
v	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TwoLongs	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
+	TokenNamePLUS
v	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
.	TokenNameDOT
second	TokenNameIdentifier
+	TokenNamePLUS
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_output	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
_output	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_output	TokenNameIdentifier
instanceof	TokenNameinstanceof
Long	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Long	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_output	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeVLong	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
TwoLongs	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TwoLongs	TokenNameIdentifier
)	TokenNameRPAREN
_output	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeVLong	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeVLong	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
code	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readVLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
code	TokenNameIdentifier
&	TokenNameAND
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
v	TokenNameIdentifier
=	TokenNameEQUAL
code	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
first	TokenNameIdentifier
=	TokenNameEQUAL
code	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
second	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readVLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TwoLongs	TokenNameIdentifier
(	TokenNameLPAREN
first	TokenNameIdentifier
,	TokenNameCOMMA
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
valid	TokenNameIdentifier
(	TokenNameLPAREN
Long	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
o	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
Long	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
||	TokenNameOR_OR
o	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
valid	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_o	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
allowDouble	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
allowDouble	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
_o	TokenNameIdentifier
instanceof	TokenNameinstanceof
Long	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
valid	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_o	TokenNameIdentifier
instanceof	TokenNameinstanceof
TwoLongs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
valid	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
_o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
getNoOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
outputToString	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
merge	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
first	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
second	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
first	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
valid	TokenNameIdentifier
(	TokenNameLPAREN
second	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TwoLongs	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
first	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
